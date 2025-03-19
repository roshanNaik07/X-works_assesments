package com.xworkz.classParameter;

public class Show {

    public void movieDetails(Poster poster){
        System.out.println("Running movieDetails in show");
        if(poster!=null) {
            poster.showInfo();
        }
        else {
            System.out.println("object is poinitng to null");
        }

    }
}
