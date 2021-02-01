package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {


    @Test
    public void is_value1_and_value3_different(){

        SameFirstLast sut = new SameFirstLast();

        Assert.assertFalse(sut.isItTheSame(new int[]{1, 2, 3}));
    }

    @Test
    public void is_value1_and_value4_same(){

        SameFirstLast sut = new SameFirstLast();

        Assert.assertTrue(sut.isItTheSame(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void is_value1_and_value3_same(){

        SameFirstLast sut = new SameFirstLast();

        Assert.assertTrue(sut.isItTheSame(new int[]{1, 2, 1}));
    }


}
