package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) {

        try {
            Occurence.occur();
        } catch (MyCustomNullException exp) {
            System.out.println("Caught NullPointerException : " + exp.getMessage());
        }

    }

}


