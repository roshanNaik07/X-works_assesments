package com.xworkz.park.collection.internal;

import com.xworkz.park.collection.external.CountryDTO;
import com.xworkz.park.collection.external.CountryRepository;
import com.xworkz.park.collection.external.CountryRepositoryImpl;

import java.util.Collection;
import java.util.Optional;

public class CountryRunner {

    public static void main(String[] args) {

        CountryRepository countryRepository = new CountryRepositoryImpl();

        Collection<CountryDTO> c = countryRepository.getAllDTO();

        System.out.println("1) Printing all country names : ");
        c.stream().forEach(t -> System.out.print(" , " + t.getName()));

        System.out.println();

        System.out.println("2) Country names ending with 'a' :");
        c.stream().filter(t -> t.getName().toLowerCase().endsWith("a")).forEach(t -> System.out.print(" , " + t.getName()));

        System.out.println();

        System.out.println("3) Country names start with 'R' :");
        c.stream().filter(t -> t.getName().toLowerCase().startsWith("r")).forEach(t -> System.out.print(" , " + t.getName()));

        System.out.println();

        System.out.println("4) country name whose pincode is 921362 : ");
        c.stream().filter(t -> t.getPinCode() == 921362).forEach(t -> System.out.print(" , " + t.getName()));

        System.out.println();

        System.out.println("5) finding the countryName using optional prime minister Modi : ");
        Optional<CountryDTO> optional = c.stream().filter(t -> "Modi".equalsIgnoreCase(t.getPrimeMinister())).findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get().getName());
        } else
            optional.empty();

        System.out.println();

        System.out.println("6) country where primary lang is english");
        c.stream().filter(t -> "english".equalsIgnoreCase(t.getPrimaryLang())).forEach(t -> System.out.print(" , "+t.getName()));

        System.out.println();

        System.out.println("7) country mass between 3162017 and 2767197");
        c.stream().filter(t-> t.getMassInSqKms() >= 2767197 && t.getMassInSqKms()<=3162017).forEach(t -> System.out.print(" , "+t.getName()));

        System.out.println();

        System.out.println("8) countries with noOfStates > 30 :");
        c.stream().filter(t->t.getNoOfStates()>30).findAny().ifPresent(t-> System.out.println(t.getName()));
    }
}
