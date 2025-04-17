package com.xworkz.Rules;

public class PilgrimVisitors implements PilgrimPlace{

    @Override
    public void rules() {
        System.out.println("No smoking");
    }

    @Override
    public void dressCode() {
        System.out.println("Visitors are allowed to take photographs in designated areas.");
    }

    @Override
    public void food() {
        System.out.println("Pilgrims must maintain silence in prayer areas.");

    }

    @Override
    public void safety() {
        System.out.println("Safety is a priority in the pilgrim place.");
    }
}
