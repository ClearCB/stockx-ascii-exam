package edu.craptocraft.stockasciiexam.item;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;



public class BidTest {
    
    @Test
    public void constructorBid(){
        Bid bid = new Bid("13",500);
        assertNotNull(bid);
        assertEquals("\n\t\t13" + "\t500", bid.toString());
    }
}
