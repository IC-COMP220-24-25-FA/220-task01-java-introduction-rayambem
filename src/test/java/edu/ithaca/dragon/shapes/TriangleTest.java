package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle testTriangle = new Triangle(2, 4);
        assertEquals(4, testTriangle.calcArea(), 0.0001);

        Triangle testTriangle2 = new Triangle(5, 1);
        assertEquals(2.5, testTriangle2.calcArea(), 0.001);

        Triangle testTriangle3 = new Triangle(3.678, 10.452);
        assertEquals(19.2212, testTriangle3.calcArea(), 0.0001);
    }   
    
    @Test
    public void doubleSizeTest(){

    }

    @Test
    public void longestLineTest(){

    }
}
