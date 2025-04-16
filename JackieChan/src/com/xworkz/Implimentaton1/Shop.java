package com.xworkz.Implimentaton1;

import com.xworkz.Rules.AmazonForest;
import com.xworkz.Rules.Bar;

public class Shop implements AmazonForest, Bar
{
    @Override
    public void rules() {
        System.out.println("Bar rules");
    }

    @Override
    public void safety() {
        System.out.println("Shop safety");
    }

    @Override
    public void fun() {
        System.out.println("Shop amazonForest");
    }

    @Override
    public void respect() {
        System.out.println("Shop bar");
    }

    @Override
    public void forest() {
        System.out.println("Shop protect");
    }


}
