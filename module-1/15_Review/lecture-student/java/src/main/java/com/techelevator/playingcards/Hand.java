package com.techelevator.playingcards;

public class Hand {

    private int numberOFCards;

    public void addCard(Card card){
        numberOFCards++;

    }
    public void addCards(Card[] cards){
        for (Card card : cards){
            addCard(card);
        }
    }

    public int getNumberOfCards(){
        return numberOFCards;
    }
}
