package com.nisum.assignment.problem.two.point.two;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        /**Q2: Write a program in java that implements Singleton design pattern.
        *The program should only make One object and upon creating another object, it should return the same object.
        *Also confirm this behaviour by prinitng the object.
        *Another way to determine same object is the "==" operator,
        *it should return `true` if you have same object in both references.
        * Limitation : Using Thread Class
         */

        System.out.println("\t\t\t Q2: Singleton Instance Using Thread Class");


        Thread t1 = new Thread(Singleton::getInstance,"Thread1");
        Thread t2 = new Thread(Singleton::getInstance,"Thread2");

        t1.start();
        t2.start();

//        t1.join();
//        t2.join();

//        Singleton obj1 = Singleton.instances.get("Thread1");
//        Singleton obj2 = Singleton.instances.get("Thread2");
//
//        System.out.println(obj1);
//        System.out.println(obj2);
//        System.out.println(obj1==obj2);




    // Printf Why it works without join??
        System.out.print(Singleton.instances.keySet());
        System.out.println();
        Singleton obj3 = Singleton.instances.get("Thread1");
        Singleton obj4 = Singleton.instances.get("Thread2");

        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj3==obj4);



    }

}
