package edu.craptocraft.stockasciiexam.item;


public class Bid implements Offer{
    String size;
    int bidValue;

    public Bid(String size, int bid) {
        this.size = size;
        this.bidValue = bid;
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
        informationBid.append("\n\t\t" + this.size);
        informationBid.append("\t"+this.bidValue);

        return informationBid.toString();
    }

}
