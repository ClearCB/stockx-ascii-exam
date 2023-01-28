package edu.craptocraft.stockasciiexam.domain.sneaker;

public interface Item {
    
    public String getStyle();

    public String getName();

    private int getSale();

    private int getAsk();

    private int getBid();

    private void setSale(int sale);

    private void setAsk(int ask);

    private void setBid(int bid);
}
