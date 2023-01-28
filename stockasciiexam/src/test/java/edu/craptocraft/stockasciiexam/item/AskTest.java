package edu.craptocraft.stockasciiexam.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AskTest {
    
    @Test
    public void constructorAsk(){
        Ask ask= new Ask("13", 500);
        assertNotNull(ask);
        assertEquals("13 500", ask.toString());
    }
}
