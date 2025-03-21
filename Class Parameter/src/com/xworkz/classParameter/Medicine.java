package com.xworkz.classParameter;

public class Medicine {

    void medicineBrand(Dolo dolo){
        System.out.println("Running medicineBrand inside Medicine");
        if(dolo!=null){
            dolo.reduceFever();
        }
        else System.out.println("dolo is pointing to null character");
    }
}
