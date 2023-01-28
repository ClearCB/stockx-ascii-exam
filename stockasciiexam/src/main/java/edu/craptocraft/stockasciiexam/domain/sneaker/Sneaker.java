package edu.craptocraft.stockasciiexam.domain.sneaker;


public class Sneaker {
    public String style;
    public String name;
    private int sale;
    private int ask;
    private int bid;
    

    public Sneaker(String style, String name){
        this.style=style;
        this.name=name;

    }

    public String getStyle() {
        return this.style;
    }


    public String getName() {
        return this.name;
    }


    private int getSale() {
        return this.sale;
    }


    private int getAsk() {
        return this.ask;
    }


    private int getBid() {
        return this.bid;
    }

    private void setSale(int sale) {
        this.sale = sale;
    }

    private void setAsk(int ask) {
        this.ask = ask;
    }

    private void setBid(int bid) {
        this.bid = bid;
    }


    @Override
    public String toString(){
        StringBuilder informationSneaker = new StringBuilder();
        informationSneaker.append("The sneaker sytle is: " + this.getStyle());
        informationSneaker.append("\nThe sneaker name is: " + this.getName());

        return informationSneaker.toString();
    }
}
