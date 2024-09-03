package edu.ithaca.dragon.shapes;

public class Triangle {
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
    }

    /**
     * @return the longest line in the triangle (assuming right-angled)
     */
    public double longestLineWithin(){
        return 0.0;
    }
}
