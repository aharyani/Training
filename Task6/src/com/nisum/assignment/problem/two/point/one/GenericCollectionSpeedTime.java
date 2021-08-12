package com.nisum.assignment.problem.two.point.one;

import java.util.*;

public class GenericCollectionSpeedTime {


    static long TraversalTime(Collection collection) {

        long start = System.currentTimeMillis();
        collection.forEach(System.out::println);
        long end = System.currentTimeMillis();

        return (end - start);
    }


}
