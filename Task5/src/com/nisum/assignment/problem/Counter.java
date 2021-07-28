package com.nisum.assignment.problem;

public class Counter {

    public static void count() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("In "+Thread.currentThread().getName()+" Counting "+i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
