package edu.craptocraft.stockasciiexam.domain.ask;

import edu.craptocraft.stockasciiexam.domain.sneaker.Offer;

public class Ask implements Offer{
    String size;
    int askValue;

    public Ask(String size, int ask) {
        this.size = size;
        this.askValue = ask;
    }

    public String getSize() {
        return this.size;
    }

    public int getAsk() {
        return this.askValue;
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
        StringBuilder informationAsk = new StringBuilder();
        informationAsk.append(this.getSize());
        informationAsk.append(" "+this.getAsk());

        return informationAsk.toString();
    }

}
