package com.nisum.assignment.problem.one;

public class StringLiteralnObject {

    /**
     * *\*String Pool: String Pool in Java is a pool of Strings which is stored in Java Heap Memory
     *
     * *\*String Literal: in String literal value are stored in String pool and address is stored in stack
     *                  Each time you create a string literal, the JVM checks the "string  pool" first.
     *                  If the string already exists in the pool, a reference to the pooled instance is returned.
     *                  If the string doesn't exist in the pool,
     *                  a new string instance is created and placed in the pool.
     *                  Example:
     *                  String strLiteral1= "Ammar";
     *                  String strLiteral2= "Ammar";   both String Literal point the same reference
     *
     * *\*String Object: it allocate space in heap memory and contain the address of string pool,
     *                  where value is saves and stack saves the address of String object
     *
     *                  Example:
     *                  String strObject1 = new String("Annus");
     *                  String strObject2 = new String("Annus"); both String object point to Different memory reference
     *
     *
     *
     *   == -----> Compare memory reference
     *   .equal() ---> Compare the value or content
     */


    public static void main(String[] args) {
        String strLiteral1= "Ammar";
        String strLiteral2= "Ammar";

        String strObject1 = new String("Annus");
        String strObject2 = new String("Annus");


        System.out.println("/* String Literal */");
        System.out.println("using .equals compare the memory reference ---> "+ (strLiteral1.equals(strLiteral2)));//compare value or content of object
        System.out.println("using == compare the value or object  -------> "+ (strLiteral1==strLiteral2));//compare the memory reference

        System.out.println("\n\n\n/* String Object */");
        System.out.println("using .equals compare the memory reference ---> "+strObject1.equals(strObject2));//compare the  memory reference
        System.out.println("using == compare the value or object  -------> "+(strObject1==strObject2));//compare the content or value of object

    }


}
