package com.nisum.assignment.problem.four.point.three;

public interface Java {
    void print();
    default void show(){
        System.out.println("In Java show");
    }
}
