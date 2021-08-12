package com.nisum.assignment.problem.two.point.three;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RestaurantImplementation implements Restaurant {

    HashMap<String, Integer> itemListRate = new HashMap<>();

    @Override
    public void insertItem(String item, Integer rate) {
        itemListRate.put(item, rate);
    }

    @Override
    public int getItemRate(String item) {
        return itemListRate.get(item);
    }

    @Override
    public int totalBill(String... items) {
        return Arrays.stream(items).map(this::getItemRate).reduce(0, Integer::sum);
    }


}
