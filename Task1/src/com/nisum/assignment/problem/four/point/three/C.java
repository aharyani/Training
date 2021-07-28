package com.nisum.assignment.problem.four.point.three;

public interface C {
    void print();
    default void show(){
        System.out.println("In C show");
    }
}
