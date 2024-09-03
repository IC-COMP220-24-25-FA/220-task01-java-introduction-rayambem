package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

       List<Rectangle> rectangleList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            Rectangle newRectangle = new Rectangle((Math.random() * 50), (Math.random() * 50));
            rectangleList.add(newRectangle);
        }
    }
}
