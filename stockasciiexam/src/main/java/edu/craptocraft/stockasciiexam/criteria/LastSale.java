package edu.craptocraft.stockasciiexam.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Offer;
import edu.craptocraft.stockasciiexam.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lastSaleFilter = new ArrayList<Offer>();
        
        for (Offer offer: item.offers()){

            if ( (offer instanceof Sale) ){
                lastSaleFilter.clear();
                lastSaleFilter.add(offer);
            }
        }
        return lastSaleFilter;

    }
}
