package com.xworkz.external;

import com.xworkz.internal.BankingApp;

public class PaytmCustomer {
    BankingApp bankingApp;

    public PaytmCustomer(BankingApp bankingApp) {
        this.bankingApp = bankingApp;
        System.out.println("Running BankingApp param const in Customer");
    }

    public void makeTransaction() {
        System.out.println("Running makeTransaction in Customer");
        this.bankingApp.transferMoney();
    }
}
