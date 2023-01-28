package edu.craptocraft.stockasciiexam.domain.sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SneakerTest {
    
    @Test
    public void constructorSneakerTest(){
        Sneaker sneaker = new Sneaker("Sneaker style", "Sneaker name");
        assertNotNull(sneaker);
        assertEquals("Sneaker name\n\t\tSneaker style", sneaker.toString());

    }

    // @Test
    // public void interfaceItemTest(){
    //     Sneaker sneaker = new Sneaker("Sneaker style", "Sneaker name");
    //     sneaker.add(null);
    // }

    // @Test
    // public void interfaceOfferTest(){

    // }
}
