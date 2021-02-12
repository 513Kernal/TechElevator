package com.techelevator;

import java.math.BigDecimal;

public class FlowerShopOrder {

    String boquetType;
    int numberOfRoses;
    BigDecimal subtotal;

    public FlowerShopOrder(String type, int howManyRoses) {
        boquetType = type;
        numberOfRoses = howManyRoses;
    }

    public static void main(String[] args){
        String valentinesMix = new String();
        FlowerShopOrder order = new FlowerShopOrder(valentinesMix, 14);
    }
    ///don't think this is right^^^

    public int getNumberOfRoses() {
        return numberOfRoses;
    }

    public String getBoquetType() {
        return boquetType;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setBoquetType(String boquetType) {
        this.boquetType = boquetType;
    }

    public void setNumberOfRoses(int numberOfRoses) {
        this.numberOfRoses = numberOfRoses;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isSameDay(String zipcode) {
        return true;
    }

    boolean isSameDay = true;
    double zipCalc;

    public int zipcode{
        if (zipcode <=20000 && zipcode >= 29999 && isSameDay)
            zipCalc = 5.99;
    }
    if (zipcode <=30000 && zipcode >= 39999 && isSameDay)
    zipCalc = 5.99;

    if (zipcode <=10000 && zipcode >= 19999 && isSameDay)
    zipCalc = 0.00;

    //zip codes >10000 and above <39999 need to be 19.99 and offer no same day



}
