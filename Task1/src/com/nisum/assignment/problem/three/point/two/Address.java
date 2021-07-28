package com.nisum.assignment.problem.three.point.two;

public class Address {
    String street;
    String postal_code;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postal_code='" + postal_code + '\'' +
                '}';
    }
}
