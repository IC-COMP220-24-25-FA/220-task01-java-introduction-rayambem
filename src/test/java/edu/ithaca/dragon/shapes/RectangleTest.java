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
        Rectangle testRectangle = new Rectangle(2, 6);
        double initialArea = testRectangle.calcArea();
        testRectangle.doubleSize();
        assertEquals(initialArea * 4, testRectangle.calcArea(), 0.0001);

        Rectangle testRectangle2 = new Rectangle(0.1, 2.222);
        double initialArea2 = testRectangle2.calcArea();
        testRectangle2.doubleSize();
        assertEquals(initialArea2 * 4, testRectangle2.calcArea(), 0.0001);

        Rectangle testRectangle3 = new Rectangle(0.00001, 0.001);
        double initialArea3 = testRectangle3.calcArea();
        testRectangle3.doubleSize();
        assertEquals(initialArea3 * 4, testRectangle3.calcArea(), 0.00000001);
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle testRectangle = new Rectangle(2, 6);
        assertEquals(6.324555, testRectangle.longestLineWithin(), 0.00001);

        Rectangle testRectangle2 = new Rectangle(0.1, 2.222);
        assertEquals(2.22424908677, testRectangle2.longestLineWithin(), 0.00000000001);

        Rectangle testRectangle3 = new Rectangle(0.00001, 0.001);
        assertEquals(0.0010000499, testRectangle3.longestLineWithin(), 0.0000000001);
    }
    
}
