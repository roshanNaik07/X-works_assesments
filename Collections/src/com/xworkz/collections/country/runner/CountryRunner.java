package com.xworkz.collections.country.runner;

import com.xworkz.collections.country.external.CountryRepository;
import com.xworkz.collections.country.internal.CountryRepositoryImpl;

import java.util.Collection;
import java.util.Comparator;
import java.util.Locale;

public class CountryRunner {

    public static void main(String[] args) {

        CountryRepository countryRepository = new CountryRepositoryImpl();
        Collection<String> countryList = countryRepository.findAll();


        System.out.println("Printing all country names : " + countryList.size());
        for (String list : countryList) {
            System.out.println(list);
        }

        System.out.println("============================================================");

        System.out.println("countries starting with 'I' :");
        countryList.stream().filter(t -> t.toLowerCase().startsWith("i")).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries starting with 'G' :");
        countryList.stream().filter(t -> t.toLowerCase().startsWith("g")).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries ending with 'a' :");
        countryList.stream().filter(t -> t.toLowerCase().endsWith("a")).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries in descending order :");
        countryList.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries in ascending order :");
        countryList.stream().sorted().forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries name with more than 6 letters :");
        countryList.stream().filter(t -> t.length() > 6).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Countries name with less than 4 letters :");
        countryList.stream().filter(t -> t.length() < 4).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Country names which has 'o' in it :");
        countryList.stream().filter(t -> t.toLowerCase().contains("o")).forEach(t -> System.out.println(t));

        System.out.println("============================================================");

        System.out.println("Country name length  :");
        countryList.stream().sorted().forEach(t -> System.out.println(t +" :"+t.length()));

        System.out.println("============================================================");

        System.out.println("Countries name reversed :");
        countryList.stream().sorted().forEach(t -> {
            String rev = new StringBuilder(t).reverse().toString();
            System.out.println(rev);
        });

        System.out.println("============================================================");

        System.out.println("palindrome country names :");
        countryList.stream().sorted().forEach(t -> {
            String rev = new StringBuilder(t).reverse().toString();
            if (t.equals(rev)) {
                System.out.println(t);
            }
        });
    }
}
