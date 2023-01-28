package edu.craptocraft.stockasciiexam.item.item.ask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.craptocraft.stockasciiexam.item.ask.Ask;

public class AskTest {
    
    @Test
    public void constructorAsk(){
        Ask ask= new Ask("13", 500);
        assertNotNull(ask);
        assertEquals("13 500", ask.toString());
    }
}
