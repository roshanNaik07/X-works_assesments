package com.xworkz.Implimentaton1;

public class PrimeNumber {
    public class PrimeNumberPrinter {
        public static void main(String[] args) {
            int limit = 100;

            System.out.println("Prime numbers between 1 and " + limit + " are:");

            for (int number = 2; number <= limit; number++) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                }
            }
