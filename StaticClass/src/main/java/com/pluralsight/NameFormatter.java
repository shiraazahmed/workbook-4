package com.pluralsight;

public class NameFormatter {
    public static void main(String[] args) {
        System.out.println(getFullName());
    }
    private static String prefix = "Mr.";
    private static String firstName = "John";
    private static String lastName = "Doe";

    public static String formatName(String prefix, String firstName, String lastName) {
        return lastName + " " + prefix + " " + firstName;
    }

    private static String getFullName() {
        return lastName + " " + prefix + " " + firstName;

    }

}
