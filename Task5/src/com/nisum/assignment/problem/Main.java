package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(Counter::count,"Thread1");
        Thread thread2 = new Thread(Counter::count,"Thread2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("\n\n\nIn "+Thread.currentThread().getName()+"Thread");


    }
}
