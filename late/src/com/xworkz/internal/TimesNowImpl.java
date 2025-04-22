package com.xworkz.internal;

public class TimesNowImpl implements NewsApp {
    public TimesNowImpl() {
        System.out.println("Running no-arg const of TimesNowImpl");
    }

    @Override
    public void readNews() {
        System.out.println("Reading news on TimesNowImpl");
    }
}
