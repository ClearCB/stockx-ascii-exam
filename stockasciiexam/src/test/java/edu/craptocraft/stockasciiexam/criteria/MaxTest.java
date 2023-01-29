package edu.craptocraft.stockasciiexam.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.item.Ask;
import edu.craptocraft.stockasciiexam.item.Bid;
import edu.craptocraft.stockasciiexam.item.Item;
import edu.craptocraft.stockasciiexam.item.Sale;
import edu.craptocraft.stockasciiexam.item.Sneaker;

public class MaxTest {
    

    @Test
    public void maxTest(){

        Size size = new Size("9.5");
        Sales sales = new Sales();
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("13", 288));
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("9.5", 479));
        sneaker.add(new Sale("9.5", 600));

        // To this test, we could also compare the toString to compare if the one tht is added is the correct one.
        // Max max = new Max(size, sales);
        // assertEquals(1,max.checkCriteria(sneaker).size());
    }
}