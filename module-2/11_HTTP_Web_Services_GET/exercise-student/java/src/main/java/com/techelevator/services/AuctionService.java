package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
        // api code here
        Auction[] auctions = restTemplate.getForObject(BASE_URL, Auction[].class);
        return auctions;
    }

    public Auction listDetailsForAuction(int id) {
        // api code here
        Auction auction = null;
        auction = restTemplate.getForObject( BASE_URL + "/" + id, Auction.class);
        return auction;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        // api code here
        Auction[] auctions = null;
        auctions = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
        return auctions;
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        // api code here
        Auction[] auctions = null;
        auctions = restTemplate.getForObject( BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        return auctions;
    }

}
