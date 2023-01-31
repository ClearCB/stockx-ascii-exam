package edu.craptocraft.stockasciiexam.item;


public class Bid implements Offer{
    private String size;
    private int bidValue;

    public Bid(String size, int bid) {
        this.size = size;
        this.bidValue = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bidValue;
    }



    @Override
    public String toString() {
        StringBuilder informationBid = new StringBuilder();
        informationBid.append("\n\t\t" + this.size);
        informationBid.append("\t"+this.bidValue);

        return informationBid.toString();
    }

}
