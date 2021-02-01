package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {

    @Test
    public void getTable_returns_if_table_is_available(){
        DateFashion sut = new DateFashion();


        Assert.assertEquals(2,sut.getATable(3,8));

    }


    @Test
    public void getTable_returns_if_table_is_unavailable(){
        DateFashion sut = new DateFashion();


        Assert.assertEquals(0,sut.getATable(2,8));

    }



    @Test
    public void getTable_returns_if_table_might_be_available(){
        DateFashion sut = new DateFashion();


        Assert.assertEquals(1,sut.getATable(5,5));

    }



}
