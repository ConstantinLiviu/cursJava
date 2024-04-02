package TemaSesiunea17Plus18;

// Design a class named Rectangle that contains
public class Rectangle {
    // Two private double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
    private double width;
    private double length;

    Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    // A constructor that creates a rectangle with the specified width and height.
    Rectangle( double width, double length) {
        this.width = width;
        this.length = length;
    }

    // A method named getArea() that returns the area of this rectangle.
    public double getArea() {
        return width*length;
    }

    // A method named getPerimeter() that returns the perimeter.
    public double getPerimeter() {
        return 2*width+2*length;
    }
}
