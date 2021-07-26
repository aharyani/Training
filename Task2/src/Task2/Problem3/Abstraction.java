package Task2.Problem3;

/**
 *  3. Write a program in java to implement abstraction, the program should have two classes "Person" and "Employee"
 * but it should not expose the details of "Person" class by using Abstraction.
 */
public class Abstraction {
    public static void main(String[] args) {
        Employee employee =new Employee();
        employee.setDetail(123,"Ammar","Haryani","03213883869");
        employee.getDetail();
    }
}


