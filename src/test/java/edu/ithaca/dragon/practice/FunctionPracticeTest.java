package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
        assertEquals(70, FunctionPractice.calcSalePrice(100, 50, 20));
        assertEquals(80.6, FunctionPractice.calcSalePrice(70, 10, 12));
        assertEquals(42.071, FunctionPractice.calcSalePrice(58.92, 32.5, 2.3));

        // Full discount, no discount
        assertEquals(3.66, FunctionPractice.calcSalePrice(376.2, 100, 3.66));

        // Zero price
        assertEquals(12, FunctionPractice.calcSalePrice(0, 25, 12));

        // Negative values
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-34, 22, 7.3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(140, -20, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(650, 18, -30));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-310, -22.22, -4));
    }
    
}
