package com.techelevator;

public class Demo {

    public static void main(String[] args) {

        Auction firstAuction = new Auction("1 20 box of 9mm bullets");
        System.out.println("High bid for the 9mm rounds is : " + firstAuction.getHighBid().getBidAmount());

        firstAuction.placeBid(new Bid("Zac", 20));
        System.out.println("High bid for the 9mm rounds is : " + firstAuction.getHighBid().getBidAmount());
        System.out.println("The winning bidder is currently : " +firstAuction.getHighBid().getBidder());

        firstAuction.placeBid(new Bid("Austin", 25));
        System.out.println("High bid for the 9mm rounds is : " + firstAuction.getHighBid().getBidAmount());
        System.out.println("The winning bidder is currently : " +firstAuction.getHighBid().getBidder());

        firstAuction.placeBid(new Bid("Sam", 15));
        System.out.println("High bid for the 9mm rounds is : " + firstAuction.getHighBid().getBidAmount());
        System.out.println("The winning bidder is currently : " +firstAuction.getHighBid().getBidder());


        ReserveAuction secondAuction = new ReserveAuction("Nvidia 3080", 800);
        secondAuction.placeBid(new Bid("Jonathan", 500));
        secondAuction.placeBid(new Bid("Zac", 850));
        System.out.println("The winning bidder is currently : " +secondAuction.getHighBid().getBidder());

        BuyoutAuction thirdAuction = new BuyoutAuction("Time Machines (Lot of 12)", 450);
        thirdAuction.placeBid(new Bid("Dan", 300));
        System.out.println("The winning bidder is currently : " +thirdAuction.getHighBid().getBidder());
        thirdAuction.placeBid(new Bid("David", 450));
        thirdAuction.placeBid(new Bid("Connor", 500));
        System.out.println("The winning bidder is currently : " +thirdAuction.getHighBid().getBidder());




    }
}
