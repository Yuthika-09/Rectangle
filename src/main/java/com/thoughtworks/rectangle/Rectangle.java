package com.thoughtworks.rectangle;

public class Rectangle {

    private final double length;  
    private final double breadth;

    public Rectangle (double length, double breadth){

        this.length = length;
        this.breadth = breadth;

    }

    public double area(){

        return (this.length * this.breadth);
    }

    public double perimeter()
    {
        double rectanglePerimeter = 2*(this.length + this.breadth);
        return rectanglePerimeter;
    }
}