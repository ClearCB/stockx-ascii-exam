package edu.craptocraft.stockasciiexam.item;


public class Sale implements Offer{
    private String size;
    private int saleValue;

    public Sale(String size, int sale) {
        this.size = size;
        this.saleValue = sale;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.saleValue;
    }

    @Override
    public String toString() {
        StringBuilder informationSale = new StringBuilder();
        informationSale.append("\n\t\t" + this.size);
        informationSale.append("\t"+this.saleValue);

        return informationSale.toString();
    }

}
