import Task1.Problem1.Student;
import Task1.Problem2.Singleton;
import Task1.Problem3point1.Car;
import Task1.Problem3point1.Truck;
import Task1.Problem3point1.Vehicle;
import Task1.Problem3point2.*;
import Task1.Problem4point1.Child;
import Task1.Problem4point2.Iphone;
import Task1.Problem4point3.ProgrammingLanguage;

public class Main {
    public static void main(String[] args) {

        /*Q1: Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)*/

        System.out.println("\t\t\t Q1: Encapsulation ");
        Student student = new Student();
        student.setFirstName("Ammar");
        student.setLastName("Haryani");
        student.setRollNo(1001);
        System.out.println(student);


        /*Q2: Write a program in java that implements Singleton design pattern.
        The program should only make One object and upon creating another object, it should return the same object.
        Also confirm this behaviour by prinitng the object.
        Another way to determine same object is the "==" operator,
        it should return `true` if you have same object in both references.*/

        System.out.println("\n\n\t\t\t Q2: Singleton ");


     Thread t1 = new Thread(()->Singleton.getInstance());
//
//        Thread t4 = new Thread(){
//            ;
//        };
        System.out.println();

        //Q3.1: Example of Inhertance
        System.out.println("\n\n\t\t\t Q3.1: Example of Inhertance ");
        Vehicle car = new Car();
        car.start();
        Vehicle truck = new Truck();
        truck.start();


        //Q3.2.1: Aggregation
        System.out.println("\n\n\t\t\t Q3.2.1: Compose class with Aggregation ");
        EmployeeAggregation aggregation =new EmployeeAggregation();
        Address address = new Address();
        address.setPostal_code("1234");
        address.setStreet("Glassglow");
        aggregation.setId(123);
        aggregation.setName("Aggregation");
        aggregation.setAddress(address);
        System.out.println(aggregation);



        //Q3.2.2: Composition
        System.out.println("\n\n\t\t\t Q3.2.1: Compose class with Composition ");
       Employee employee = new Employee();
       long salary = employee.getSalary();
       System.out.println("Salary of employee :"+salary);




        /*Q4: Abstract class and interface. (difference) interface mulitple inheritance
        (if both interfaces method same then what is the behaviour,abstract class and interface)*/

        //Q4.1:Example of Multiple Inheritance in Interface
        System.out.println("\n\n\t\t\t Q4.1: Example of Multiple Inheritance in Interface ");
        Child child = new Child();
        System.out.println("Variable define in Father Interface :"+child.x);
       // child.x = 20; //Compile-time error because Variables declared in interface are public, static and final by default.
        child.laziness();
        child.height();
        child.intelligence();
        child.cooking();
        System.out.println("Multiple inheritance is allowed in Interface in java");



        //Q4.2: Task Example of Abstract Class
        System.out.println("\n\n\t\t\t Q4.2: Example of Abstract class ");
        Iphone iphone = new Iphone();
        iphone.call();
        iphone.message();
        iphone.smartPhone();
        System.out.println("In Abstract class it is not necessary to implements method when implementing it by interface or extended it by other abstract class");



        //Q4.3: If two interfaces have same method in java what is the behavior
        System.out.println("\n\n\t\t\t Q4.3: If two interfaces have same method in java what is the behavior ");
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.print();
        programmingLanguage.show();
        System.out.println("1-  If class implements two interfaces, and each interface define a method that has identical signature, then in effect there is only one method, and they are not distinguishable");
        System.out.println("2- If class implements two interfaces, and each interface has same method with different  ");
        System.out.println("3- When having same default method,an explicit call to an interface default method can be made from inside an implementing class using super");













    }

}
