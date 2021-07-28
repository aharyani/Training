package com.nisum.assignment.problem.three;

public class Main {
    public static void main(String[] args) {
        /**
        *3. Write a java program to make a String(""Java is an Object Oriented Language"") using ""StringBuffer"" and ""StringBuilder"" and
         * also traverse through both the Strings and print the traversal time in milliseconds.
         *Also observe which String class is faster than the other.
         */
        long buffer = StringBuffernBuilder.stringBuffer();
        long builder = StringBuffernBuilder.stringBuilder();

        System.out.println("Traversal time of String Buffer is "+ buffer);
        System.out.println("Traversal time of String Builder is "+ builder);

    }
}
