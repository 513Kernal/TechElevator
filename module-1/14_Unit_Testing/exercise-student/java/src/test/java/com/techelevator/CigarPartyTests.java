package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

    @Test
    public void party_is_not_weekend_or_weekday(){
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(30, false);
        Assert.assertFalse(haveParty);
    }

    @Test
    public void if_weekday_but_more_cigars(){
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(50, false);
        Assert.assertTrue(haveParty);
    }

    @Test
    public void if_weekend_but_more_cigars(){
        CigarParty sut = new CigarParty();

        boolean haveParty = sut.haveParty(70, true);
        Assert.assertTrue(haveParty);
    }


}
