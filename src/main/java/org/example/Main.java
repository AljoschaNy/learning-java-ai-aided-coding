package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "Hallo";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}