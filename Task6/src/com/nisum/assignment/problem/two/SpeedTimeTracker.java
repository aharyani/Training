package com.nisum.assignment.problem.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpeedTimeTracker {


    static long arrayListTraversalTime() {

        long start = System.currentTimeMillis();

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        for (Integer list : arrayList) {
            if (list.equals(arrayList.get(arrayList.size() - 1)))
                System.out.println("Value at last index of Arraylist is " + list);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    static long linkListTraversalTime() {
        long start = System.currentTimeMillis();

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        for (Integer list : linkedList) {
            if (list.equals(linkedList.getLast()))
                System.out.println("Value at last index of Linkedlist is " + list);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

}
