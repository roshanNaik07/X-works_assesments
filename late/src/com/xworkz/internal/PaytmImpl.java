package com.xworkz.internal;

public class PaytmImpl implements BankingApp {
    public PaytmImpl() {
        System.out.println("Running no-arg const of PaytmImpl");
    }

    @Override
    public void transferMoney() {
        System.out.println("Transferring money using PaytmImpl");
    }
}
