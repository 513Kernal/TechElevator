package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {

    @Test
    public void getLucky13_returns_false(){
        Lucky13 sut = new Lucky13();


        Assert.assertFalse(sut.getLucky(new int[]{1, 2, 4}));
    }

    @Test
    public void getLucky13_returns_false_with_multiple_1_3(){
        Lucky13 sut = new Lucky13();


        Assert.assertFalse(sut.getLucky(new int[]{1, 2, 3}));
    }

    @Test
    public void getLucky13_returns_true(){
        Lucky13 sut = new Lucky13();


        Assert.assertTrue(sut.getLucky(new int[]{0, 2, 4}));
    }



}
