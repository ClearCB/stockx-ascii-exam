package edu.craptocraft.stockasciiexam.item.offer;

public interface Offer {

    String size();

    int value();

    int compareTo(Offer offer);
}
