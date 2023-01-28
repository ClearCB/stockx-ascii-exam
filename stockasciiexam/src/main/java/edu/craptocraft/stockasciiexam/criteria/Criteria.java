package edu.craptocraft.stockasciiexam.criteria;

import java.util.List;

import edu.craptocraft.stockasciiexam.item.Offer;
import edu.craptocraft.stockasciiexam.item.Item;

public interface Criteria {
    
    List<Offer> checkCriteria(Item item);
}
