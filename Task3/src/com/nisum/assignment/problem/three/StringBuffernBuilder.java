package com.nisum.assignment.problem.three;

public class StringBuffernBuilder {


    static long stringBuffer() {
        /**
         *  String Buffer
         *  1-Faster than String but slower than String Builder
         *  2-Thread Safe
         *  **/
        long start = System.currentTimeMillis();
        java.lang.StringBuffer strBuffer = new java.lang.StringBuffer("Java is an Object Oriented Language");

        for (int i = 0; i < 50; i++) {

            System.out.println(strBuffer);
            System.out.println(strBuffer.reverse());
        }

        long end = System.currentTimeMillis();

        return (end - start);

    }


    static long stringBuilder() {
        /**
         *  String Builder
         *  1- Faster than String Buffer due to no over head of synchronized structure
         *  2-Not thread safe
         *  **/
        long start = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder("Java is an Object Oriented Language");

        for (int i = 0; i < 50; i++) {
            System.out.println(strBuilder);
            System.out.println(strBuilder.reverse());
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

}
