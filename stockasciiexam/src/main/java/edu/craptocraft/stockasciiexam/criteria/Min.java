package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class Min implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCritera){
        this.criteria = criteria;
        this.otherCriteria = otherCritera;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> maxBothFilters = new ArrayList<Offer>();

        for(Offer offer: this.criteria.checkCriteria(item) ){

            for(Offer otherOffer: this.otherCriteria.checkCriteria(item)){

                    if ( (offer.equals(otherOffer)) && (maxBothFilters.isEmpty()) ){
                        maxBothFilters.add(offer);
                        continue;
                    }
        
                    if ( (offer.equals(otherOffer)) && (offer.value() < maxBothFilters.get(0).value()) ){
                        maxBothFilters.clear();
                        maxBothFilters.add(offer);
                    }
            }
        }
        return maxBothFilters;
        
    }

}
