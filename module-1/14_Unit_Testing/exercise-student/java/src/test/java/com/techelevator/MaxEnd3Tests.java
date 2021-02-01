package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {

    @Test
    public void maxEnd3_returns_all_max_numbers_if_value1_is_larger_than_3(){
        MaxEnd3 sut = new MaxEnd3();

        int[] nums = sut.makeArray(new int[]{11, 5, 9});


        Assert.assertArrayEquals(new int[]{11, 11, 11}, nums);

    }

    @Test
    public void maxEnd3_returns_all_max_numbers_if_value3_is_larger_than_1(){
        MaxEnd3 sut = new MaxEnd3();

        int[] nums = sut.makeArray(new int[]{1, 2, 3});


        Assert.assertArrayEquals(new int[]{3, 3, 3}, nums);

    }


    @Test
    public void maxEnd3_returns_all_max_numbers_regardless_of_middle(){
        MaxEnd3 sut = new MaxEnd3();

        int[] nums = sut.makeArray(new int[]{2, 11, 3});


        Assert.assertArrayEquals(new int[]{3, 3, 3}, nums);

    }



}
