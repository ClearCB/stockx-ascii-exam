package edu.craptocraft.stockasciiexam.item;


public class Sale implements Offer{
    String size;
    int saleValue;

    public Sale(String size, int sale) {
        this.size = size;
        this.saleValue = sale;
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
        StringBuilder informationSale = new StringBuilder();
        informationSale.append("\n\t\t" + this.size);
        informationSale.append("\t"+this.saleValue);

        return informationSale.toString();
    }

}
