package com.nisum.assignment.problem.two.point.one;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Create a generic function that take any collection and return traversal time
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));

        long arrayListTime = GenericCollectionSpeedTime.TraversalTime(arrayList);
        long linkedListTime = GenericCollectionSpeedTime.TraversalTime(linkedList);

        System.out.println("Travesal time for ArrayList is " + arrayListTime);
        System.out.println("Travesal time for LinkedList is " + linkedListTime);


    }
}
