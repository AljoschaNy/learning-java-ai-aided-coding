package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "Hallo";
        String reversed = reverseString(input);
        System.out.println(reversed);

        String input2 = "Anna";
        boolean isPalindrome = isPalindrome(input2);
        System.out.println(isPalindrome ? "It's a palindrome." : "It's not a palindrome.");
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
}