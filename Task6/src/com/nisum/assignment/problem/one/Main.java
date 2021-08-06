package com.nisum.assignment.problem.one;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 1. Write a program in java that searches a perticular item from an ArrayList(items are sorted) using JAVA COLLECTION API search methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList() {
        };
        numList.add(10);
        numList.add(20);
        numList.add(33);
        numList.add(45);
        numList.add(66);
        numList.add(99);


        int result = CollectionSearch.searchValue(numList, 99);

        if (result >= 0)
            System.out.println("Found at index " + result);
        else
            System.out.println("Value doesn't exist ");

    }
}
