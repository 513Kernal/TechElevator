package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {

    @Test
    public void ifLess_than(){
        Less20 sut = new Less20();


        Assert.assertTrue(sut.isLessThanMultipleOf20(19));
    }

    @Test
    public void ifLess_than_18(){
        Less20 sut = new Less20();


        Assert.assertTrue(sut.isLessThanMultipleOf20(18));
    }

    @Test
    public void ifLess_20multiple(){
        Less20 sut = new Less20();

        Assert.assertFalse(sut.isLessThanMultipleOf20(20));
    }

}
