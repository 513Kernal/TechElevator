package com.techelevator.readfiles;

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTests {

    @Test
    public void count_words_in_line(){
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this is a test");

        Assert.assertEquals(4,count);
    }

    @Test
    public void count_words_in_line_handles_empty_string(){
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("");

        Assert.assertEquals(0,count);
    }

    @Test
    public void count_words_in_line_handles_space_at_beginning_and_end(){
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("    this is a test   ");

        Assert.assertEquals(4,count);
    }

    @Test
    public void count_words_in_line_handles_spaces_in_middle(){
        WordCounter sut = new WordCounter();

        int count = sut.countWordsInLine("this    is  a     test");

        Assert.assertEquals(4,count);
    }

}
