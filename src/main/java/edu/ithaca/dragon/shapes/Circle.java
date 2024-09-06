package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        
        this.radius = radius;
    }

    /**
     * @return the radius of this circle
     */
    public double getRadius(){
        return this.radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double newRadius = this.radius * 2;
        this.radius = newRadius;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double longestLineWithin = this.radius * 2;
        return longestLineWithin;
    }

    /**
     * @return string representation of circle essentials
     */
    public String toString(){
        String circleString = String.format("Circle radius: %.2f\nCircle area: %.2f\n", this.radius, this.calcArea());
        return circleString;
    }

}
