package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * @return the area of this rectangle
     */
    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of this rectangle
     */
    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest line within this rectangle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
