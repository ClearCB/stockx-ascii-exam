package edu.craptocraft.stockasciiexam.domain.sneaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SneakerTest {
    
    @Test
    public void constructorSneakerTest(){
        Sneaker sneaker = new Sneaker("Sneaker style", "Sneaker name");
        assertNotNull(sneaker);
        assertEquals("The sneaker sytle is: Sneaker style\nThe sneaker name is: Sneaker name", sneaker.toString());

    }
}
