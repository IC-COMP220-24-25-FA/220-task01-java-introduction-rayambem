package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle testTriangle = new Triangle(2, 4);
        assertEquals(4, testTriangle.calcArea(), 0.0001);

        Triangle testTriangle2 = new Triangle(5, 1);
        assertEquals(2.5, testTriangle2.calcArea(), 0.0001);

        Triangle testTriangle3 = new Triangle(3.678, 10.452);
        assertEquals(19.2212, testTriangle3.calcArea(), 0.0001);
    }; 
    
    @Test
    public void doubleSizeTest(){
        Triangle testTriangle = new Triangle(2, 4);
        double initialArea = testTriangle.calcArea();
        testTriangle.doubleSize();
        assertEquals(initialArea, testTriangle.doubleSize(), 0.0001);

        Triangle testTriangle2 = new Triangle(5, 1);
        double initialArea2 = testTriangle2.calcArea();
        testTriangle2.doubleSize();
        assertEquals(initialArea2, testTriangle2.doubleSize(), 0.0001);

        Triangle testTriangle3 = new Triangle(3.678, 10.452);
        double initialArea3 = testTriangle3.calcArea();
        testTriangle3.doubleSize();
        assertEquals(initialArea3, testTriangle3.doubleSize(), 0.0001);
    };

    @Test
    public void longestLineTest(){
        Triangle testTriangle = new Triangle(2, 4);
        assertEquals(4.4721, testTriangle.longestLineWithin(), 0.0001);

        Triangle testTriangle2 = new Triangle(5, 1);
        assertEquals(5.0990, testTriangle2.longestLineWithin(), 0.0001);

        Triangle testTriangle3 = new Triangle(3.678, 10.452);
        assertEquals(11.0802, testTriangle3.longestLineWithin(), 0.0001);
    };
}
