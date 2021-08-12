package com.nisum.assignment.problem.two.point.three;

public interface Restaurant {

    int getItemRate(String item);

    int totalBill(String... items);

    void insertItem(String item, Integer rate);
}
