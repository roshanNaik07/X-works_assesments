package com.xworkz.Internal;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string or number:");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}
