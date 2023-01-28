package edu.craptocraft.stockasciiexam.item;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;



public class SaleTest {
    
    @Test
    public void constructorSale(){
        Sale sale = new Sale("13",500);
        assertNotNull(sale);
        assertEquals("\n\t\t13" + "\t500", sale.toString());
    }
}
