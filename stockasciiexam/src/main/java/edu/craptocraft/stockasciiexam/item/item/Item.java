package edu.craptocraft.stockasciiexam.item.item;

import java.util.List;

import edu.craptocraft.stockasciiexam.item.offer.Offer;

public interface Item {
    
    int getBid();
    
    int getAsk();
    
    int getSale();

    void add(Offer offer);
    
    List<Offer> offers();

    void setBid(int bid);
    
    void setAsk(int ask);
    
    void setSale(int sale);
    
}
