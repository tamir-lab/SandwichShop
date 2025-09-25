package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size;
        double basePrice = 0;
        System.out.println("What size you want for your sandwich? Regular or Large? ");
        size = scanner.nextLine();

        if (size.equalsIgnoreCase("Regular")){
            basePrice = 5.45;
            System.out.println("How old are you? ");
            int age = scanner.nextInt();
            if (age <= 17){
                basePrice *= 0.9;
            }
            else if (age >= 65) {
                basePrice *= 0.8;
            }
            else {
                System.out.println("Wrong age");
            }
        }
        else if (size.equalsIgnoreCase("Large")) {
            basePrice = 8.95;
            System.out.println("How old are you? ");
            int age = scanner.nextInt();
            if (age <= 17){
                basePrice *= 0.9;
            }
            else if (age >= 65) {
                basePrice *= 0.8;
            }
            else {
                System.out.println("Wrong age");
            }
        }
        else {
            System.out.println("We don't have such a size");
        }

        System.out.printf("Your total is %.2f", basePrice);

        scanner.close();
    }
}
