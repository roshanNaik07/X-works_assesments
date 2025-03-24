package com.xworkz.MondayMood;

public class MayuraHR {

    void getDetails(MayuraFrights mayuraFrights){
        if(mayuraFrights!=null){
            System.out.println("Location is :"+mayuraFrights.location);
            System.out.println("number of emp is :"+mayuraFrights.noOfEmp);
            mayuraFrights.getEmpID();
            mayuraFrights.getExpences();
            mayuraFrights.empDetails(mayuraFrights);
        }
    }
}
