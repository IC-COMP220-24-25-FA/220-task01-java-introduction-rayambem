package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import java.util.stream.IntStream;


public class ShapeMain {
    public static void rectangleLoop(int i, List<Rectangle> rectangleList, double[] largestLineThrough){
        Rectangle currentRectangle = rectangleList.get(i);

        System.out.println(String.format("Area of rectangle %s : %.4f", i + 1, currentRectangle.calcArea()));

        largestLineThrough[0] += currentRectangle.longestLineWithin();
    }
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

       List<Rectangle> rectangleList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            Rectangle newRectangle = new Rectangle((Math.random() * 10), (Math.random() * 10));
            rectangleList.add(newRectangle);
        }

        double[] largestLineThrough = {0};

        IntStream.range(0, rectangleList.size()).forEach(i -> rectangleLoop(i, rectangleList, largestLineThrough));

        System.out.println(String.format("Longest line through all rectangles: %.4f" , largestLineThrough[0]));

        );
    }
}
