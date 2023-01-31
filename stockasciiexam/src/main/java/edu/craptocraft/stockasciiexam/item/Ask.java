package edu.craptocraft.stockasciiexam.item;

public class Ask implements Offer{
    private String size;
    private int askValue;

    public Ask(String size, int ask) {
        this.size = size;
        this.askValue = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.askValue;
    }

    @Override
    public String toString() {
        StringBuilder informationAsk = new StringBuilder();
        informationAsk.append("\n\t\t" + this.size);
        informationAsk.append("\t"+this.askValue);

        return informationAsk.toString();
    }

}
