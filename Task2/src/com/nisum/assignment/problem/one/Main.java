package com.nisum.assignment.problem.one;

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



    }
}
