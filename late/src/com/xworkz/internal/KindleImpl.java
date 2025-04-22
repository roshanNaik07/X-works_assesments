package com.xworkz.internal;

public class KindleImpl implements BookStore {
    public KindleImpl() {
        System.out.println("Running no-arg const of KindleImpl");
    }

    @Override
    public void purchaseBook() {
        System.out.println("Purchasing book using KindleImpl");
    }
}
