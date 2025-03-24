package com.xworkz.Monight;

import com.xworkz.MondayMood.MayuraFrights;

public class MayuraClient {

    void getClientDetails(MayuraFrights mayuraFrights){
        if (mayuraFrights!=null){
            mayuraFrights.empDetails(mayuraFrights);
            System.out.println("Location is : "+mayuraFrights.location);
        }
    }
}
