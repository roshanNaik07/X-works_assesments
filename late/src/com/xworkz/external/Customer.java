package com.xworkz.external;

import com.xworkz.internal.Restaurant;

public class Customer {
    Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
        System.out.println("Customer constructor with Restaurant");
    }

    public void eat() {
        if (restaurant != null) {
            System.out.println("Customer is eating...");
            restaurant.serveFood();
        }
    }
}
