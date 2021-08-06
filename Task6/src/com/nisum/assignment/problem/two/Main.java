package com.nisum.assignment.problem.two;

public class Main {
    /**
     * 2. Write a java program that searches last item in an ArrayList and Linked List and prints the search time in milliseconds to check which collection
     * is faster in traversing and searching a perticular item.
     *
     * NOTE: The data stored in both the collections is same and the item serched is also fixed according to position in the collection.
     *    e.g [23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100] and you are finding "100"(last item) in both the collections.
     */

    public static void main(String[] args) {
        System.out.println("Traversal time of Arraylist is "+SpeedTimeTracker.arrayListTraversalTime());
        System.out.println("Traversal time of Linkedlist is "+SpeedTimeTracker.linkListTraversalTime());
    }
}
