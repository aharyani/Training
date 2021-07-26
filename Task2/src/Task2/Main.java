package Task2;

import Task2.Problem1.AreaOfShapes;
import Task2.Problem2.Circle;
import Task2.Problem2.Rectangle;
import Task2.Problem2.Shape;
import Task2.Problem2.Triangle;
import Task2.Problem3.Employee;
import Task2.Problem3.Person;

public class Main {
    public static void main(String[] args) {

        /*
       1. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Compile-Time polymorphism.
       * HINT: You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()""
       *Limitations: Inheritance is not allowed.
         */
        System.out.println("\t\t\t Q1: Compile-Time polymorphism --> Overloading ");
        AreaOfShapes.calculateArea(1.1);
        AreaOfShapes.calculateArea(1,1);
        AreaOfShapes.calculateArea(9.0,10.0);


        /*
        2. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Run-Time polymorphism.
        *HINT: 1. You can Use only one method name for calculating area of all the shapes - e.g:""calculateArea()"".
        *      2. Inheritance is allowed.
         */
        System.out.println("\n\n\n\t\t\t Q2: Run-Time polymorphism --> OverRidding ");
        Shape circle = new Circle(2);
        Shape triangle = new Triangle(3,4);
        Shape rectangle = new Rectangle(4,5);

        circle.area();
        triangle.area();
        rectangle.area();


        /*
         3. Write a program in java to implement abstraction, the program should have two classes ""Person"" and ""Employee""
          but it should not expose the details of ""Person"" class by using Abstraction."
         */
        System.out.println("\n\n\n\t\t\t Q3: Implement abstraction");
        Employee employee = new Employee();
        employee.setDetail(1,"Ammar","Haryani","03213883869");
        employee.getDetail();



    }
}
