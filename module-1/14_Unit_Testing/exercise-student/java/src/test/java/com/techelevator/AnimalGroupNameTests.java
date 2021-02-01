package com.techelevator;

import com.techelevator.AnimalGroupName;
import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void getHerd_returns_Tower_for_giraffe(){
        //arrange
        AnimalGroupName sut = new AnimalGroupName();
        //act
        String herd = sut.getHerd("giraffe");
        //Assert
        Assert.assertEquals("Tower",herd);
    }

    @Test
    public void get_unknown_herd_name(){
        AnimalGroupName sut = new AnimalGroupName();

        String getherd = sut.getHerd("walrus");

        Assert.assertEquals("unknown",getherd);
    }
}
