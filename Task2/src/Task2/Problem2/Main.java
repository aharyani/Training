package Task2.Problem2;

import Task2.Problem1.AreaOfShapes;
import Task2.Problem3.Employee;

public class Main {
    public static void main(String[] args) {

        /*
        2. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Run-Time polymorphism.
        *HINT: 1. You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()"".
        *      2. Inheritance is allowed.
         */
        System.out.println("\t\t\t Q2: Run-Time polymorphism --> OverRidding ");
        Shape circle = new Circle(2);
        Shape triangle = new Triangle(3,4);
        Shape rectangle = new Rectangle(4,5);

        circle.area();
        triangle.area();
        rectangle.area();




    }
}
