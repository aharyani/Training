package com.nisum.assignment.problem.four.point.two;

abstract public class Nokia implements MobilePhone{
    // In Abstract class it is not necessary to implements method when implementing it by interface or extended it by other abstract class
    @Override
    public void call() {
        System.out.println("Call");
    }

    @Override
    public void message() {
        System.out.println("Message");
    }
}
