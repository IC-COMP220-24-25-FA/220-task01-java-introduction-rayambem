package edu.ithaca.dragon.shapes;

public interface Shape {
    // Should public be part of method declarations?
    double calcArea();

    void doubleSize();

    double longestLineWithin();

    String toString();
}
