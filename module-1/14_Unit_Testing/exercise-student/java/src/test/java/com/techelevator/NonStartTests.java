package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void given2Strings_test_hello_there() {
        NonStart sut = new NonStart();

        Assert.assertEquals("ellohere",sut.getPartialString("Hello","There"));
    }

    @Test
    public void given2Strings_test_java_code() {
        NonStart sut = new NonStart();

        Assert.assertEquals("avaode",sut.getPartialString("java","code"));
    }

    @Test
    public void given2Strings_test_shotl_java() {
        NonStart sut = new NonStart();

        Assert.assertEquals("hotlava",sut.getPartialString("shotl","java"));
    }
}
