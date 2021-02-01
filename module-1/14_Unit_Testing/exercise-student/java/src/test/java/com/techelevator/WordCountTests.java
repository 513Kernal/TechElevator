package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTests {

    @Test
    public void getCount_words_1(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{"ba", "ba", "black","sheep"});
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep",1);

        Assert.assertEquals(expected,words);


        //WordCount sut = new WordCount();
        //String[] testArray = new String[]{"ba","ba","black","sheep"};
        //Map<String, Integer> expectedMap = Map.of("ba", 2, "black", 1, "sheep", 1);
        //act
        //Map<String, Integer> actualMap = sut.getCount(testArray);
        //assert
        //Assert.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void getCount_words_2(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{"a","b","a","c","b"});
        int value1 = words.get("a");
        int value2 = words.get("b");
        int value3 = words.get("c");

        Assert.assertEquals(2,value1);
        Assert.assertEquals(2,value2);
        Assert.assertEquals(1,value3);
    }

    @Test
    public void getCount_if_words_empty(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{});
        Map<String, Integer> expected = new HashMap<>();

        Assert.assertEquals(expected,words);
    }

    @Test
    public void getCount_words_4(){
        WordCount sut = new WordCount();
        Map<String, Integer> words = sut.getCount(new String[]{"c","b","a"});
        int value1 = words.get("c");
        int value2 = words.get("b");
        int value3 = words.get("a");

        Assert.assertEquals(1, value1);
        Assert.assertEquals(1, value2);
        Assert.assertEquals(1, value3);
    }



}
