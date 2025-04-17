package com.xworkz.Rules;

public interface Tax {

    void tax();

    void taxRate();

    void taxFiling();

    default void taxBenefits() {
        System.out.println("Tax benefits can help reduce your taxable income.");
    }
}
