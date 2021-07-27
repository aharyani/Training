package Task1.Problem2;

import Task1.Problem1.Student;
import Task1.Problem3point1.Car;
import Task1.Problem3point1.Truck;
import Task1.Problem3point1.Vehicle;
import Task1.Problem3point2.Address;
import Task1.Problem3point2.EmployeeAggregation;
import Task1.Problem3point2.EmployeeComposition;
import Task1.Problem4point1.Child;
import Task1.Problem4point2.Iphone;
import Task1.Problem4point3.ProgrammingLanguage;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        /*Q2: Write a program in java that implements Singleton design pattern.
        The program should only make One object and upon creating another object, it should return the same object.
        Also confirm this behaviour by prinitng the object.
        Another way to determine same object is the "==" operator,
        it should return `true` if you have same object in both references.*/

        System.out.println("\t\t\t Q2: Singleton ");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Singleton> callable1 = () -> Singleton.getInstance();
        Callable<Singleton> callable2 = () -> Singleton.getInstance();
        Future<Singleton> future1 = executor.submit(callable1);
        Future<Singleton> future2 = executor.submit(callable2);
        executor.shutdown();
        Singleton obj1 = future1.get();
        Singleton obj2 = future2.get();


        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1==obj2);











    }

}
