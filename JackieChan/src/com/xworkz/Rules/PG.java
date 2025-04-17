package com.xworkz.Rules;

public interface PG {

    void pay();

    void clean();

    void silence();

    default void Timing(){
        System.out.println("PG timing is 10 PM");
    }
}
