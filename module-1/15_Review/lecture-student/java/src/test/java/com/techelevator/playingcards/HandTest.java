package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

public class HandTest {

    @Test
    public void addCard_adds_card_to_hand(){
        Hand sut = new Hand(); //assumes hand is empty
        Card card = new Card();

        //int startingCount = sut.getNumberOfCards();

        sut.addCard(card);
        int endingCount = sut.getNumberOfCards();

        Assert.assertEquals(1, endingCount);
    }

    @Test
    public void getNumberOfCards_returns_correct_count(){
        Hand sut = new Hand();
        Card card1 = new Card();
        Card card2 = new Card();
        sut.addCard(card1);
        sut.addCard(card2);

        Assert.assertEquals(2,sut.getNumberOfCards());
    }

    @Test
    public void addCards_adds_multiple_cards_to_hand(){
        Hand sut = new Hand();

        //////  this makes the array first
        //
        // Card[] cards = new Card[] {new Card(), new Card(), new Card()};
        //  below would just be sut.addCards(cards);  adds cards from line 38 to 40
        sut.addCards(new Card[] {new Card(), new Card(), new Card(),});

        Assert.assertEquals(3, sut.getNumberOfCards());
    }


}
