package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    public static final String[] ALL_SUITs = {"Spades", "Diamonds", "Hearts", "Clubs"};
    public static final String[] ALL_RANKS = {"Ace", "Two", "Three", "Four", "Five",
    "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    List<Card> allCards = new ArrayList<>();
    //contains a list of all cards in a deck

    public Deck(){
        for (String suit : ALL_SUITs){
            for (String rank : ALL_RANKS){
                Card newCard = new Card(rank, suit);
                allCards.add(newCard);
            }
        }
    }
    public Card drawCard(){
        Card drawnCard = allCards.remove(0);
        return drawnCard;
    }

    public int getCardCount(){
        return allCards.size();
    }

    public void shuffle() {
        Collections.shuffle(allCards);
    }

}
