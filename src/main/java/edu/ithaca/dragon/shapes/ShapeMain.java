package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import java.util.stream.IntStream;


public class ShapeMain {
    public static void rectanglePrintingLoop(int i, List<Rectangle> rectangleList, double[] largestLineThrough){
        Rectangle currentRectangle = rectangleList.get(i);

        System.out.println(String.format("Area of rectangle %s : %.4f", i + 1, currentRectangle.calcArea()));

        largestLineThrough[0] += currentRectangle.longestLineWithin();
    }
    
    public static void main(String[] args){
        List<Shape> shapesList = new ArrayList<>();

        // Creating 10 random shapes for shapesList
        for(int i = 0; i < 10; i++){
            int shapePicker = (int) Math.round(Math.random() * 2);

            if (shapePicker == 0){
                shapesList.add(new Circle(Math.random() * 10));
                System.out.println(String.format("%d. %s", i + 1, shapesList.get(i).toString()));
            } else if (shapePicker == 1){
                shapesList.add(new Rectangle((Math.random() * 10), (Math.random() * 10)));
                System.out.println(String.format("%d. %s", i + 1, shapesList.get(i).toString()));
            } else if (shapePicker == 2){
                shapesList.add(new Triangle((Math.random() * 10), (Math.random() * 10)));
                System.out.println(String.format("%d. %s", i + 1, shapesList.get(i).toString()));
            }
        }

        // Doubling all shape sizes and printing then strings again
        int shapeCount = 0;
        for (Shape shape : shapesList) {
            shape.doubleSize();
            System.out.println(String.format("%d. %s", shapeCount += 1, shape.toString()));
        }


        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

       List<Rectangle> rectangleList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            Rectangle newRectangle = new Rectangle((Math.random() * 10), (Math.random() * 10));
            rectangleList.add(newRectangle);
        }

        double[] largestLineThrough = {0};

        IntStream.range(0, rectangleList.size()).forEach(i -> rectanglePrintingLoop(i, rectangleList, largestLineThrough));
        System.out.println(String.format("Longest line through all rectangles: %.4f" , largestLineThrough[0]));

        Scanner rectangleScanner = new Scanner(System.in);

        for (int inputSession = 0; inputSession < 5; inputSession++){
            System.out.println("Which rectangle's size would you like to double?");

            String selectedRectangleString = rectangleScanner.nextLine();
            int selectedRectangleInt = Integer.parseInt(selectedRectangleString);

            while (selectedRectangleInt <=0 || selectedRectangleInt > rectangleList.size()) {
                System.out.println("Invalid rectangle selection! Must be between 1 and 5!");
                selectedRectangleString = rectangleScanner.nextLine();
                selectedRectangleInt = Integer.parseInt(selectedRectangleString);
            }

            Rectangle selectedRectangle = rectangleList.get(selectedRectangleInt - 1);

            selectedRectangle.doubleSize();

            System.out.println();

            IntStream.range(0, rectangleList.size()).forEach(i -> rectanglePrintingLoop(i, rectangleList, largestLineThrough));
            System.out.println(String.format("Longest line through all rectangles: %.4f" , largestLineThrough[0]));
        };

        rectangleScanner.close();
    }
}
