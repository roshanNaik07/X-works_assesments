package com.xworkz.internal;

public class CustomerWithdrawImpl implements ATM {

    public CustomerWithdrawImpl() {
        System.out.println("no arg constructor of CustomorWithdrawImpl");
    }

    @Override
    public void withdraw() {
        System.out.println("Running withdraw in CustomorWithdrawImpl");
    }
}
