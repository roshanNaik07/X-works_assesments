package com.xworkz.Monight;

import com.xworkz.MondayMood.Resort;

public class ResortCustomer {

    void getCustomerDetails(Resort resort){
        if(resort!=null){
            System.out.println("Resort Name is : "+resort.name);
            resort.display(resort);
        }

        else System.out.println("resort is pointing to null");
    }


}
