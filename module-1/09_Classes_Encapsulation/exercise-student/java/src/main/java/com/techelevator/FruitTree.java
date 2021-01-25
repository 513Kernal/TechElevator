package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;
    }

    //retrieve type of fruit
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    //pieces of fruit left
    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfFruitToRemove) {
        if (piecesOfFruitLeft > 0) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfFruitToRemove;
            return true;
        } else {
            return false;
        }


    }
}
