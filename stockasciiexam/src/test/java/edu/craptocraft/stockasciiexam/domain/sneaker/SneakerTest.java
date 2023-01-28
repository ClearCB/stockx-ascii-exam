package edu.craptocraft.stockasciiexam.domain.sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Formatter.BigDecimalLayoutForm;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.domain.bid.Bid;

public class SneakerTest {
    
    @Test
    public void constructorSneakerTest(){
        Sneaker sneaker = new Sneaker("Sneaker style", "Sneaker name");
        assertNotNull(sneaker);
        assertEquals("Sneaker name\n\t\tSneaker style", sneaker.toString());

    }

    @Test
    public void interfaceItemTest(){
        Sneaker sneaker = new Sneaker("Sneaker style", "Sneaker name");
        Bid bid = new Bid("13",500);
        
        assertEquals(0,sneaker.offers().size());
        sneaker.add(bid);
        assertEquals(1,sneaker.offers().size());

    }

    // @Test
    // public void interfaceOfferTest(){

    // }
}
