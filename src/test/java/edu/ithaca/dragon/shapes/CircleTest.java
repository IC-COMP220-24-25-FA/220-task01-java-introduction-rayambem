package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void doubleSizeTest(){
        Circle testCircle = new Circle(2);
        testCircle.doubleSize();
        assertEquals(4, testCircle.getRadius(), 0.0001);

        Circle testCircle2 = new Circle(1.5);
        testCircle2.doubleSize();
        assertEquals(3, testCircle2.getRadius(), 0.0001);

        Circle testCircle3 = new Circle(3);
        double initialArea = testCircle3.calcArea();
        testCircle3.doubleSize();
        double newArea = testCircle3.calcArea();
        assertEquals(initialArea * 4, newArea, 0.0001);
    }

    @Test
    public void longestLineWithinTest(){
        Circle testCircle = new Circle(2);
        assertEquals(4, testCircle.longestLineWithin(), 0.0001);

        Circle testCircle2 = new Circle(0.23456);
        assertEquals(0.46912, testCircle2.longestLineWithin(), 0.0001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }


    
}
