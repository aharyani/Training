package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) {

        /**
         *1. Write a Java program to create a custom exception class that deals with NULL Strings 
         *   (your custom exception should be thrown if String is NULL)
         */

        try {
            Occurence.occur();
        } catch (MyCustomNullException exp) {
            System.out.println("Caught NullPointerException : " + exp.getMessage());
        }

    }

}


