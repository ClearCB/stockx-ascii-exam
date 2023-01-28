package edu.craptocraft.stockasciiexam.domain.bid;

import edu.craptocraft.stockasciiexam.domain.sneaker.Offer;

public class Bid implements Offer{
    String size;
    int bidValue;

    public Bid(String size, int bid) {
        this.size = size;
        this.bidValue = bid;
    }

    public String getSize() {
        return this.size;
    }

    public int getBid() {
        return this.bidValue;
    }

    @Override
    public String size() {
        return null;
    }

    @Override
    public int value() {
        return 0;
    }

    @Override
    public int compareTo(Offer offer) {
        return 0;
    }


    @Override
    public String toString() {
        StringBuilder informationBid = new StringBuilder();
        informationBid.append(this.getSize());
        informationBid.append(" "+this.getBid());

        return informationBid.toString();
    }

}
