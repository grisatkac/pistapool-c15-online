package com.tms.git;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        int sumPrecipitation = 0;
        int amountOPrecipitation;
        int maxPrecipitation = 0;
        double averagePrecipitation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of days: ");
        int amountOfDays = scanner.nextInt();

        for (int i = 1; i <= amountOfDays; i++) {
            System.out.println("Input amount of precipitation in : ");
            amountOPrecipitation = scanner.nextInt();
            sumPrecipitation += amountOPrecipitation;
            if (amountOPrecipitation >  maxPrecipitation) {
                maxPrecipitation = amountOPrecipitation;
            }
        }

        scanner.close();

        averagePrecipitation = (double) sumPrecipitation / amountOfDays;

        System.out.println("Amount of days: " + amountOfDays);
        System.out.println("Sum precipitation: " +  sumPrecipitation);
        System.out.println("Average precipitation: " + averagePrecipitation);
        System.out.println("Max precipitation: " + maxPrecipitation);
    }
}
