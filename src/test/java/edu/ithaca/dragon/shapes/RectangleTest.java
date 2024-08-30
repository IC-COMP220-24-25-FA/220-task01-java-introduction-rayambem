package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle testRectangle = new Rectangle(2, 6);
        assertEquals(12, testRectangle.calcArea(), 0.0001);

        Rectangle testRectangle2 = new Rectangle(0.1, 2.222);
        assertEquals(0.2222, testRectangle2.calcArea(), 0.0001);

        Rectangle testRectangle3 = new Rectangle(0.00001, 0.001);
        assertEquals(0.00000001, testRectangle3.calcArea(), 0.00000001);
    }

    @Test
    public void doubleSizeTest(){
        throw new RuntimeException("Not implemented yet");
    }

    @Test
    public void longestLineWithinTest(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
