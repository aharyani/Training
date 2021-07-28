package com.nisum.assignment.problem.two;

public class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void area() {
        double area = width * length;
        System.out.println("Area of Rectangle is :" + area);
    }
}
