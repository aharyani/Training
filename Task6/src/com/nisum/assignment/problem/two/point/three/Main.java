package com.nisum.assignment.problem.two.point.three;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new RestaurantImplementation();
        restaurant.insertItem("Curry", 200);
        restaurant.insertItem("Pulao", 300);
        restaurant.insertItem("Biryani", 400);
        restaurant.insertItem("Sandwich", 150);
        restaurant.insertItem("Burger", 190);


        String[] selectedItems = {"Curry", "Pulao", "Biryani","Burger"};

        System.out.println("Total Bill " + restaurant.totalBill(selectedItems));


    }

}
