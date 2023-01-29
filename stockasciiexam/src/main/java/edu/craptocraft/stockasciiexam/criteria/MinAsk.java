package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Ask;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;


public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> minAskFilter = new ArrayList<Offer>();

        for (Offer offer: item.offers()){
            
            if ( (offer instanceof Ask) && (minAskFilter.isEmpty()) ){
                minAskFilter.add(offer);
                continue;
            }

            if ( (offer instanceof Ask) && (offer.value() < minAskFilter.get(0).value()) ){
                minAskFilter.clear();
                minAskFilter.add(offer);
            }
        }
        
        return minAskFilter;
    }
}
