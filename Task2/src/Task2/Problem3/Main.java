package Task2.Problem3;

import Task2.Problem1.AreaOfShapes;
import Task2.Problem2.Circle;
import Task2.Problem2.Rectangle;
import Task2.Problem2.Shape;
import Task2.Problem2.Triangle;

public class Main {
    public static void main(String[] args) {

        /*
         3. Write a program in java to implement abstraction, the program should have two classes ""Person"" and ""Employee""
          but it should not expose the details of ""Person"" class by using Abstraction."
         */
        System.out.println("\t\t\t Q3: Implement abstraction");
        Employee employee = new Employee();
        employee.setDetail(1,"Ammar","Haryani","03213883869");
        employee.getDetail();



    }
}
