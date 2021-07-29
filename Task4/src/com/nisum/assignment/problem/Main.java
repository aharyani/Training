package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) {


        try {
            simulateNullPointerException();
        } catch (NullException exp) {
            System.out.println("Caught MyNullPointerException : "+exp.getMessage());
        }



    }


    private static void simulateNullPointerException() {
        try {
            String blankString = null;
            System.out.println("String length :"+blankString.length());
            //simulating null pointer exception.
        } catch (NullPointerException exp) {
            throw new NullException("Using Custom Null Exception");
        }
    }
}


