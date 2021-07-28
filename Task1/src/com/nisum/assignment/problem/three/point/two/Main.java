package com.nisum.assignment.problem.three.point.two;

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
