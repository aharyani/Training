package com.nisum.assignment.problem.three;

public class Main {
    public static void main(String[] args) {

        /*
         3. Write a program in java to implement abstraction, the program should have two classes ""Person"" and ""Employee""
          but it should not expose the details of ""Person"" class by using Abstraction."
         */
        System.out.println("\t\t\t Q3: Implement abstraction");
        Person person = new Employee();
        person.setDetail(1,"Ammar","Haryani","03213883869");
        person.getDetail();



    }
}
