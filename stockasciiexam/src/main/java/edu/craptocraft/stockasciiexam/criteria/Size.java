package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class Size implements Criteria{
    String sizeObjective;

    public Size(String size){
        this.sizeObjective = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sizeFiltered = new ArrayList<Offer>();

        for (Offer offer: item.offers()){

            if (offer.size().equals(this.sizeObjective)){
                sizeFiltered.add(offer);
            }
        }
        
        return sizeFiltered;
    }
}
