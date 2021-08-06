package com.nisum.assignment.problem.three;

import java.util.*;

/**
 * 3. Write a java program that takes unsorted records of Students inside an ArrayList and sorts them in "Ascending Order" according to student name.
 * NOTE: - If more than one students have same name, then sort the record according to age, in Ascending Order.
 * - Use Comparator to sort the Student objects inside the ArrayList.
 * - Student class field are "id", "name" and "age".
 */
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Salman", 39));
        studentList.add(new Student(2, "Zeeshan", 44));
        studentList.add(new Student(1, "Ammar", 39));
        studentList.add(new Student(5, "Nabeel", 55));
        studentList.add(new Student(4, "Ammar", 28));
        studentList.add(new Student(6, "Rizwan", 35));

        Comparator<Student> logic = (Student o1, Student o2) -> {
            if (o1.getName().compareTo(o2.getName()) == 0)
                return o1.getAge() > o2.getAge() ? 1 : -1;

            return o1.getName().compareTo(o2.getName());
        };

        Collections.sort(studentList, logic);

        studentList.forEach(System.out::println);

    }
}
