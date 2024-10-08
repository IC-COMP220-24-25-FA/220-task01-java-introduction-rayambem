package edu.ithaca.dragon.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Invalid arguments! Numbers must be positive.");
        }

        int largestNumber = first;

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(first);
        numbersList.add(second);
        numbersList.add(third);

        for (int numberValue : numbersList){
            largestNumber = Math.max(numberValue, largestNumber);
        }

        return largestNumber;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice < 0 || discountPercent < 0 || salesTax < 0){
            throw new IllegalArgumentException("Arguments cannot be negative!");
        }

        double discountedPrice = originalPrice - ((discountPercent / 100) * originalPrice);
        double withTax = discountedPrice + salesTax;
        return withTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if(yearsOld < 0 || daysSinceShoesChewed < 0){
            throw new IllegalArgumentException("Dog age and chewing days must be positive numbers!");
        }

        if (yearsOld < 4){
            return true;
        } else if (daysSinceShoesChewed >= 7 || fetchedThePaperToday){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if(numbers.size() < 1){
            return -1;
        }

        // WHY COULDNT I ACCESS LargestNumber FROM THE IF BLOCK WHILE IT WAS AN INTEGER? WHY DID I HAVE TO CHANGE IT TO AN ARRAY??
        int[] largestNumber = {Integer.MIN_VALUE};
        int[] largestNumberIndex = {0};
       
        IntStream.range(0, numbers.size()).forEach((i) -> 
            {if(numbers.get(i) > largestNumber[0]){
                largestNumber[0] = numbers.get(i);
                largestNumberIndex[0] = i;
                }
            }
        );

        return largestNumberIndex[0];
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if(numbers.size() < 1){
            return -1;
        }

        int[] largestNumber = {Integer.MIN_VALUE};
        int[] largestNumberIndex = {0};
       
        IntStream.range(0, numbers.size()).forEach((i) -> 
            {if(numbers.get(i) >= largestNumber[0]){
                largestNumber[0] = numbers.get(i);
                largestNumberIndex[0] = i;
                }
            }
        );

        return largestNumberIndex[0];
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws IllegalArgumentException when letter cannot be found in any strings
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        int maxCharCount = 0;
        String maxCharString = "";

        for (String word : words){
            int charCount = 0;
            for (char wordChar : word.toCharArray()){
                if(wordChar == letter){
                    charCount++;
                }
            }
            if(charCount > maxCharCount){
                maxCharCount = charCount;
                maxCharString = word;
            }
        }

        if(maxCharCount == 0){
            throw new IllegalArgumentException("Character could not be found in any strings included!");
        }

        return maxCharString;
    }


}
