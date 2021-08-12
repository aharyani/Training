package com.nisum.assignment.problem.two.point.two;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {


    <T> long genericFunction(Consumer<T> consumer, T t) {

        long start = System.currentTimeMillis();
        consumer.accept(t);
        long end = System.currentTimeMillis();

        return (end - start);
    }
/**
 * ovlerloading was giving casting error
 */
//    <T> long myFunction(Predicate<T> predicate, T t) {
//
//        long start = System.currentTimeMillis();
//        System.out.println(predicate.test(t));
//        long end = System.currentTimeMillis();
//
//        return (end - start);
//    }
//
//    <T> long myFunction(Function function, T t) {
//
//        long start = System.currentTimeMillis();
//        System.out.println(function.apply(t));
//        long end = System.currentTimeMillis();
//
//        return (end - start);
//    }
}
