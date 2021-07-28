package com.nisum.assignment.problem.three.point.one;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

              //Q3.1: Example of Inhertance
        System.out.println("\t\t\t Q3.1: Example of Inhertance ");
        Vehicle car = new Car();
        car.start();
        Vehicle truck = new Truck();
        truck.start();




    }

}
