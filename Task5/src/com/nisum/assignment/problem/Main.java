package com.nisum.assignment.problem;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    /**
     * 1. Write a program in java that creates 3 Threads i.e Main, Thread1 and Thread2.
     * Print execution count down messages for Thread 1 and Thread 2, also make Thread 1 and Thread 2 sleep for 1 second.
     * Finally Main thread should end it's execution after Thread2 and Thread1 finish their execution
     *
     * Limitations: You can not use "sleep()" mehtod for "main" thread.
     */
        Thread thread1 = new Thread(Counter::count,"Thread1");
        Thread thread2 = new Thread(Counter::count,"Thread2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("\n\n\nIn "+Thread.currentThread().getName()+"Thread");


    }
}
