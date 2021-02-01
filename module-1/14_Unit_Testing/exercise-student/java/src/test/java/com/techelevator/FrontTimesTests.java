package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {
    @Test
    public void string_returns_first_3_or_greater(){
        FrontTimes sut = new FrontTimes();

        //String result = sut.generateString("ChoChoCho",3);

        Assert.assertEquals("ChoChoCho", sut.generateString("Chocolate", 3));

        //Assert.assertEquals("ChoChoCho", result);
    }

    @Test
    public void string_less_than_three(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("ChCh", sut.generateString("Ch", 2));
    }

    //lines were all covered after this test above

    @Test
    public void string_is_blank(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("", sut.generateString("", 3));
    }

    @Test
    public void string_is_null(){
        FrontTimes sut = new FrontTimes();

        Assert.assertEquals("", sut.generateString(null, 3));
    }


}
