package com.nisum.assignment.problem.one;

import com.nisum.assignment.problem.three.Student;

import java.util.*;

public class CollectionSearch {

    public static int searchValue(ArrayList numList, int value) {

        int index = Collections.binarySearch(numList, value);
        return index;

    }

}
