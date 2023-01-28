package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Bid;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsFilter = new ArrayList<Offer>();
        
        for (Offer offer: item.offers()){

            if (offer instanceof Bid){
                bidsFilter.add(offer);
            }
        }
        return bidsFilter;
    }
}
