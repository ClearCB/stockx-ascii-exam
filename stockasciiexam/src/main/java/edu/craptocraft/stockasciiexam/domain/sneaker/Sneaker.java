package edu.craptocraft.stockasciiexam.domain.sneaker;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers;
    

    public Sneaker(String style, String name){
        this.style=style;
        this.name=name;
        this.offers=new ArrayList<Offer>();

    }

    public String getStyle() {
        return this.style;
    }


    public String getName() {
        return this.name;
    }


    public int getSale() {
        return this.sale;
    }


    public int getAsk() {
        return this.ask;
    }


    public int getBid() {
        return this.bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void add(Offer offer){
        this.offers().add(offer);
    }

    @Override
    public List<Offer> offers(){
        return this.offers;
    }

    @Override
    public String toString(){
        StringBuilder informationSneaker = new StringBuilder();
        informationSneaker.append(this.getName());
        informationSneaker.append("\n" + "\t\t" +this.getStyle());

        return informationSneaker.toString();
    }
}
