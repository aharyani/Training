package com.nisum.assignment.problem.three;

public class Employee implements Person {

    private int id;
    private String firstName;
    private String lastName;
    private String contactNo;

    @Override
    public void setDetail(int id, String firstName, String lastName, String contactNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
    }

    @Override
    public void getDetail() {
        System.out.println("Employee Detail:: \n Id: " + this.id +
                "\n First Name: " + this.firstName +
                "\n Last Name: " + this.lastName +
                "\n Contact No: " + this.contactNo);
    }
}
