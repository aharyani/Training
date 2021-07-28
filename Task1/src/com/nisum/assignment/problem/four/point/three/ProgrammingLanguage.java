package com.nisum.assignment.problem.four.point.three;

public class ProgrammingLanguage implements Java,C{

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        Java.super.show();
    }

}
