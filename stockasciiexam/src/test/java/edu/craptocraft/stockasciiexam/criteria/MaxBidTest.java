package edu.craptocraft.stockasciiexam.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.item.Ask;
import edu.craptocraft.stockasciiexam.item.Bid;
import edu.craptocraft.stockasciiexam.item.Sale;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Sneaker;

public class MaxBidTest {
    
    @Test
    public void maxBidCriteriaTest(){
 
        MaxBid maxBid = new MaxBid();
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("13", 288));
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("9.5", 479));

        
        assertEquals(479,maxBid.checkCriteria(sneaker).get(0).value());
        
        sneaker.add(new Bid("6", 550));
        sneaker.add(new Bid("9.5", 600));

        assertEquals(600,maxBid.checkCriteria(sneaker).get(0).value());

    }
}
