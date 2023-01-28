package edu.craptocraft.stockasciiexam.domain.bid;

import edu.craptocraft.stockasciiexam.domain.sneaker.Offer;

public class Bid implements Offer{
    String size;
    int bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String getSize() {
        return this.size;
    }

    public int getBid() {
        return this.bid;
    }

    @Override
    public String size() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(Offer offer) {
        // TODO Auto-generated method stub
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
