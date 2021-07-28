package com.nisum.assignment.problem.four.point.three;

public class Main {

    public static void main(String[] args){

        //Q4.3: If two interfaces have same method in java what is the behavior
        System.out.println("\t\t\t Q4.3: If two interfaces have same method in java what is the behavior ");
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.print();
        programmingLanguage.show();
        System.out.println("1-  If class implements two interfaces, and each interface define a method that has identical signature, then in effect there is only one method, and they are not distinguishable");
        System.out.println("2- If class implements two interfaces, and each interface has same method with different  ");
        System.out.println("3- When having same default method,an explicit call to an interface default method can be made from inside an implementing class using super");













    }

}
