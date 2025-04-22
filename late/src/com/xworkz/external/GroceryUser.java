package com.xworkz.external;

import com.xworkz.internal.GroceryApp;

public class GroceryUser {
    GroceryApp groceryApp;

    public GroceryUser(GroceryApp groceryApp) {
        this.groceryApp = groceryApp;
        System.out.println("Running GroceryApp param const in GroceryUser");
    }

    public void getGroceries() {
        System.out.println("Running getGroceries in GroceryUser");
        this.groceryApp.orderGroceries();
    }
}
