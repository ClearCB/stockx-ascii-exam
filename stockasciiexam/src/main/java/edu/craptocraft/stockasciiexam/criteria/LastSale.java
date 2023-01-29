package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Ask;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> asksFilter = new ArrayList<Offer>();
        
        for (Offer offer: item.offers()){

            if (offer instanceof Ask){
                asksFilter.add(offer);
            }
        }
        return asksFilter;
    }
}
