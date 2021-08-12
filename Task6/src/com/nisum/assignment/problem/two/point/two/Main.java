package com.nisum.assignment.problem.two.point.two;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

        Functions functions = new Functions();

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        System.out.println("Linked list traversal time :" + functions.genericFunction(System.out::println, linkedList)+"\n");

        System.out.println("Boolean traversal time :"+ functions.genericFunction(System.out::println,true)+"\n");

        System.out.println("String traversal time :"+ functions.genericFunction(System.out::println,"Ammar Haryani")+"\n");


    }



}
