package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;

public class AndCriteria implements Criteria{
    Criteria criteria;
    Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bothFilters = new ArrayList<Offer>();

        for(Offer offer: this.criteria.checkCriteria(item) ){

            for(Offer otherOffer: this.otherCriteria.checkCriteria(item)){

                    if ( (offer.equals(otherOffer)) && (!bothFilters.contains(offer)) ){
                        bothFilters.add(offer);
                    }
            }
        }
        return bothFilters;
        
    }

    
}
