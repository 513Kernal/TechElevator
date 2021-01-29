package com.techelevator.playingcards;

import org.junit.Assert;
import org.junit.Test;

import javax.print.attribute.standard.MediaSize;

public class CardTest {

    @Test
    public void no_arg_constructor_make_ace_of_spades(){
        //Arrange & Act
        Card sut = new Card();
    //sut = system under test
        //Assert
        Assert.assertEquals("Ace", sut.getRank());
        Assert.assertEquals(Suit.SPADES, sut.getSuit());
    }

    @Test
    public void constructor_makes_specified_card(){
        //arrange & act
        Card sut = new Card("Jack", Suit.DIAMONDS);
        //Assert
        Assert.assertEquals("Jack", sut.getRank());
        Assert.assertEquals(Suit.DIAMONDS, sut.getSuit());
    }

    @Test
    public void getDescription_returns_back_of_card_when_face_down(){
        //Arrange
        Card sut = new Card();
        sut.setFaceUp(false);
        //Act
        String description = sut.getDescription();
        //Assert
        Assert.assertEquals("Back of Card", description);
    }

    @Test
    public void getDescription_returns_rank_of_suit_when_face_up(){
        //Arrange
        Card sut = new Card();
        sut.setFaceUp(true);
        //Act
        String description = sut.getDescription();
        //Assert
        Assert.assertEquals("Ace of Spades", description);
    }

    @Test

    public void getValueForRank_returns_correct_value_for_ace() {

        String rank = "Ace";
        //act
        int value = Card.getValueForRank(rank);
        //Assert
        Assert.assertEquals(14,value);
    }

    @Test
    public void getValueForRank_returns_zero_for_invalid_ranks(){

        Assert.assertEquals(0,Card.getValueForRank(""));
        Assert.assertEquals(0,Card.getValueForRank(null));
        Assert.assertEquals(0,Card.getValueForRank("blah"));
    }

    @Test
    public void flip_changes_faceUp_to_faceDown(){
        Card sut = new Card();
        sut.setFaceUp(true);

        sut.flip();

        Assert.assertFalse(sut.isFaceUp());
    }

    @Test
    public void flip_changes_faceDown_to_faceUp(){
        Card sut = new Card();
        sut.setFaceUp(false);

        sut.flip();

        Assert.assertTrue(sut.isFaceUp());
    }

    @Test
    public void isHigherThan_returns_true_if_value_higher(){
        Card sut = new Card();
        //Ace of Spades
        Card OtherCard = new Card("Two",Suit.CLUBS);


        Assert.assertTrue(sut.isHigherThan(OtherCard));
    }


    @Test
    public void getHalfValue_returns_two_and_a_half_for_five(){
        Card sut = new Card("Five", Suit.CLUBS);

        double value = sut.getHalfValue();

        Assert.assertEquals(2.5,value, .001);
    }

}
