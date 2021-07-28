package com.nisum.assignment.problem.three.point.two;

public class EmployeeComposition {

    //composition has-a relationship
    private int id;
    private Job job;


    public EmployeeComposition(){
        this.job=new Job();
        job.setSalary(1000);
    }
    public int getSalary() {
        return job.getSalary();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
