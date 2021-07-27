package Task1.Problem3point2;

import Task1.Problem1.Student;
import Task1.Problem2.Singleton;
import Task1.Problem3point1.Car;
import Task1.Problem3point1.Truck;
import Task1.Problem3point1.Vehicle;
import Task1.Problem4point1.Child;
import Task1.Problem4point2.Iphone;
import Task1.Problem4point3.ProgrammingLanguage;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {


        //Q3.2.1: Aggregation
        System.out.println("\t\t\t Q3.2.1: Compose class with Aggregation ");
        EmployeeAggregation aggregation =new EmployeeAggregation();
        Address address = new Address();
        address.setPostal_code("1234");
        address.setStreet("Glassglow");
        aggregation.setId(123);
        aggregation.setName("Aggregation");
        aggregation.setAddress(address);
        System.out.println(aggregation);



        //Q3.2.2: Composition
        System.out.println("\n\n\t\t\t Q3.2.2: Compose class with Composition ");
       EmployeeComposition employee = new EmployeeComposition();
       long salary = employee.getSalary();
       System.out.println("Salary of employee :"+salary);



    }

}
