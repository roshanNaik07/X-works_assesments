package com.xworkz.MondayMood;

public class MayuraFrights {

    public String location = "Rammurthi Nagar";
    int noOfEmp = 10;
    private String type = "Logistics";

    public void getEmpID(){
        System.out.println("Running getEmpId in MayuraFrights");
    }

    void getExpences(){
        System.out.println("Running getEpenses");
    }

    private void hireEmp(MayuraFrights mayuraFrights){
        if (mayuraFrights!=null){
            System.out.println("Running hireEmp");
            System.out.println("company type is :"+mayuraFrights.type);
        }
        else System.out.println("mayuraFrights pointing to null");
    }

    public void empDetails(MayuraFrights mayuraFrights){
        mayuraFrights.hireEmp(mayuraFrights);
    }
}
