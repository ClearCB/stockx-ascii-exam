package edu.craptocraft.stockasciiexam.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.item.Ask;
import edu.craptocraft.stockasciiexam.item.Bid;
import edu.craptocraft.stockasciiexam.item.Sale;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Sneaker;

public class LastSaleTest {
    
    @Test
    public void bidsCriteriaTest(){
 
        LastSale lastSale = new LastSale();
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("13", 288));
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("9.5", 479));

        assertEquals(479,lastSale.checkCriteria(sneaker));

        sneaker.add(new Sale("9.5", 200));
        sneaker.add(new Sale("9.5", 100));
        assertEquals(100,lastSale.checkCriteria(sneaker));

    }
}
