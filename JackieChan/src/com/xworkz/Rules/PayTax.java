package com.xworkz.Rules;

public class PayTax implements Tax{

    @Override
    public void tax() {
        System.out.println("Pay tax on time");
    }

    @Override
    public void taxRate() {
        System.out.println("Follow the rules of tax payment");
    }

    @Override
    public void taxFiling() {
        System.out.println("Avoid penalties by paying on time");
    }

    @Override
    public void taxBenefits() {
        System.out.println("Tax benefits can help reduce your taxable income.");
    }
}
