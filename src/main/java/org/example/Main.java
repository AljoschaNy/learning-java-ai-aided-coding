package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Hallo";
        String reversed = reverseString(input);
        System.out.println(reversed);

        String input2 = "Anna";
        boolean isPalindrome = isPalindrome(input2);
        System.out.println(isPalindrome ? "It's a palindrome." : "It's not a palindrome.");

        int n = 10;
        List<Integer> primes = generateFirstNPrimes(n);
        System.out.println(primes);
    }

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }

    public static boolean isPalindromeWithSpecialChars(String input) {
        if (input == null) {
            return false;
        }
        //String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanedInput = input.toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversed);
    }

    public static List<Integer> generateFirstNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;  // Start with the first prime number
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}