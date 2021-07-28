package com.nisum.assignment.problem.five;

public class Main {
    public static void main(String[] args) {
        /**
         *  5. Write a Java program to count the number of Prime Numbers less than a given positive number.
         *  Hint: To complete the above program, you can also start with a program to find if any given number is prime or not?
         */
        int num =10;
        int count = PrimeNumber.primeNumber(num);
        System.out.println("Total Prime Number till "+ (num-1) +" is "+ count);
    }
}
