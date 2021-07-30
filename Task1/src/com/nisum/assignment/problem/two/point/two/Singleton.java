package com.nisum.assignment.problem.two.point.two;

import java.util.HashMap;

public class Singleton {
   public static HashMap<String,Singleton> instances = new HashMap<>();
    private static Singleton singleton;
    private Singleton(){}

    public static void getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                    instances.put(Thread.currentThread().getName(),singleton);
                }else{
                    instances.put(Thread.currentThread().getName(),singleton);
                }
            }
        }else{
            instances.put(Thread.currentThread().getName(),singleton);
        }

    }
