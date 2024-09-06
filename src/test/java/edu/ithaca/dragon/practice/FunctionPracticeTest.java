package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        // Checks that the positioning of arguments does not affect largestOfThree() results
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));

        // Accounts for any confusion from having the same value for all arguments
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        // Checks that the right exception is thrown when invalid arguments are used - no matter where they are placed
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        // Regular case
        assertEquals(70, FunctionPractice.calcSalePrice(100, 50, 20), 0.0001);
        assertEquals(80.6, FunctionPractice.calcSalePrice(70, 10, 17.6), 0.0001);
        assertEquals(42.071, FunctionPractice.calcSalePrice(58.92, 32.5, 2.3), 0.0001);

        // Full discount, no discount
        assertEquals(3.66, FunctionPractice.calcSalePrice(376.2, 100, 3.66), 0.0001);
        assertEquals(379.86, FunctionPractice.calcSalePrice(376.2, 0, 3.66), 0.0001);

        // Zero price
        assertEquals(12, FunctionPractice.calcSalePrice(0, 25, 12), 0.0001);

        // Negative values
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-34, 22, 7.3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(140, -20, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(650, 18, -30));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-310, -22.22, -4));
    }
    
    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(2, 0, false));
        assertTrue(FunctionPractice.isGoodDog(4, 0, true));
        assertFalse(FunctionPractice.isGoodDog(6, 0, false));
        assertFalse(FunctionPractice.isGoodDog(9, 4, false));
        assertTrue(FunctionPractice.isGoodDog(9, 8, false));
        
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(-6, 0, false));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(0, -3, false));
    }
    
    @Test
    public void findFirstLargestTest(){
        // Regular list
        List<Integer> testNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4));
        assertEquals(2, FunctionPractice.findFirstLargest(testNumbers));

        // With empty list
        List<Integer> testNumbers2 = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findFirstLargest(testNumbers2));
    
        // With repeated value
        List<Integer> testNumbers3 = new ArrayList<>(Arrays.asList(1, 39, 4, 10, 39, 2, 0));
        assertEquals(1, FunctionPractice.findFirstLargest(testNumbers3));

        // With only one value
        List<Integer> testNumbers4 = new ArrayList<>(Arrays.asList(438));
        assertEquals(0, FunctionPractice.findFirstLargest(testNumbers4));

        // With negative values
        List<Integer> testNumbers5 = new ArrayList<>(Arrays.asList(-10, -16, -6, -3, -9, -20, -3, -88));
        assertEquals(3, FunctionPractice.findFirstLargest(testNumbers5));

    }

    @Test
    public void findLastLargestTest(){
        // Regular list
        List<Integer> testNumbers = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4));
        assertEquals(2, FunctionPractice.findLastLargest(testNumbers));

        // With empty list
        List<Integer> testNumbers2 = new ArrayList<>();
        assertEquals(-1, FunctionPractice.findLastLargest(testNumbers2));
    
        // With repeated value
        List<Integer> testNumbers3 = new ArrayList<>(Arrays.asList(1, 39, 4, 10, 39, 2, 0));
        assertEquals(4, FunctionPractice.findLastLargest(testNumbers3));

        // With only one value
        List<Integer> testNumbers4 = new ArrayList<>(Arrays.asList(438));
        assertEquals(0, FunctionPractice.findLastLargest(testNumbers4));

        // With negative values
        List<Integer> testNumbers5 = new ArrayList<>(Arrays.asList(-10, -16, -6, -3, -9, -20, -3, -88));
        assertEquals(6, FunctionPractice.findLastLargest(testNumbers5));
    }

}
