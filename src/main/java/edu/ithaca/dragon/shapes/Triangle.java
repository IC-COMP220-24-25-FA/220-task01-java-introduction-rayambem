package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    private double triangleHeight;
    private double triangleBase;

    public Triangle(double height, double base) {
        triangleHeight = height;
        triangleBase = base;
    }

    /**
     * @return the area of this triangle
    */
    public double calcArea(){
        double area = 0.5 * triangleHeight * triangleBase;
        return area;
    }

    /**
     * @post double the size of the triangle
     */
    public void doubleSize(){
        triangleHeight *= 2;
        triangleBase *= 2;
    }

    /**
     * @return the longest line in the triangle (assuming right-angled)
     */
    public double longestLineWithin(){
        double longestLine = Math.sqrt((triangleBase * triangleBase) + (triangleHeight * triangleHeight));
        return longestLine;
    }

    /**
     * @return string representation of rectangle essentials
     */
    public String toString(){
        String triangleString = String.format("Triangle dimensions (b x h): %.2f x %.2f\nRectangle area: %.2f", triangleBase, triangleHeight, this.calcArea());
        return triangleString;
    }

}
