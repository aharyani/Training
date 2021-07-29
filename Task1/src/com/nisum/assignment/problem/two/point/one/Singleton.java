package com.nisum.assignment.problem.two.point.one;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
