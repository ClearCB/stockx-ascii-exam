package edu.craptocraft.stockasciiexam.domain.sneaker;

public interface Offer {

    String size();

    int value();

    int compareTo(Offer offer);
}
