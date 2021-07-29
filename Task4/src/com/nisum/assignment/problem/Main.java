package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) {


        try {
            occur();
        } catch (MyNullException exp) {
            System.out.println("Caught MyNullPointerException : " + exp.getMessage());
        }

    }


    private static void occur() {
        try {
            String blankString = null;
            System.out.println("String length :" + blankString.length());
            //calling custom null pointer exception.
        } catch (NullPointerException exp) {
            throw new MyNullException("Using Custom Null Exception");
        }
    }
}


