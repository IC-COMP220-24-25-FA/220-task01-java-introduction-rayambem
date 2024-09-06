package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
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
       double area = this.length * this.width;
       return area;
    }

    /**
     * @post doubles the size of this rectangle
     */
    public void doubleSize(){
        double newLength = this.length * 2;
        double newWidth = this.width * 2;

        this.length = newLength;
        this.width = newWidth;
    }

    /**
     * @return the longest line within this rectangle
     */
    public double longestLineWithin(){
        double longestLineWithin = Math.pow((this.length * this.length) + (this.width * this.width), 0.5);
        return longestLineWithin;
    }
    
    /**
     * @return string representation of rectangle essentials
     */
    public String toString(){
        String rectangleString = String.format("Rectangle dimensions (l x w): %.2f x %.2f\nRectangle area: %.2f\n", this.length, this.width, this.calcArea());
        return rectangleString;
    }

}
