package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Bid;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> maxBidFilter = new ArrayList<Offer>();
        
        for (Offer offer: item.offers()){

            if ( (offer instanceof Bid) && (maxBidFilter.isEmpty()) ){
                maxBidFilter.add(offer);
                continue;
            }

            if ( (offer instanceof Bid) && (offer.value() > maxBidFilter.get(0).value()) ){
                maxBidFilter.clear();
                maxBidFilter.add(offer);
            }
        }
        return maxBidFilter;
    }

}
