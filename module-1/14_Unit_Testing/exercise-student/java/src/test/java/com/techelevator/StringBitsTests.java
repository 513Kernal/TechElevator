package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {


    @Test
    public void every_other_letter(){
        StringBits sut = new StringBits();

        Assert.assertEquals("Hlo",sut.getBits("Hello"));
    }


    @Test
    public void first_character(){
        StringBits sut = new StringBits();

        Assert.assertEquals("H",sut.getBits("Hi"));
    }

    @Test
    public void hello_characters(){
        StringBits sut = new StringBits();

        Assert.assertEquals("Hello",sut.getBits("Heeololeo"));
    }


}
