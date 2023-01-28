package edu.craptocraft.stockasciiexam.item.item.bid;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.item.bid.Bid;


public class BidTest {
    
    @Test
    public void constructorBid(){
        Bid bid = new Bid("13",500);
        assertNotNull(bid);
        assertEquals("13 500", bid.toString());
    }
}
