package com.utils;

import java.util.Scanner;

public class Convertor {

    static String[] arrayString = new String[] {"km", "ml"};

    final static double CONVERTER_DISTANCE = 1.60934;

    public static double getConverterKmToMl(double km) {
        return km / CONVERTER_DISTANCE;
    }

    public static double getConverterMlToKm(double ml) {
        return ml * CONVERTER_DISTANCE;
    }
/*
*In this function:
*   1. write greetings
    2. if you want find miles from kilometers, program use first "if", or if you want search kilometers from miles,
    program will use second "if", then program stopped on 1 second, and all starts again.
 */
    public static void bodyFunction(Scanner scanner, String choice) {
        System.out.println("Please write distance:");
        try {
            if (choice.equals(arrayString[0])) {
                int km = Integer.parseInt(scanner.next());
                System.out.println(km + arrayString[0] + " = " + Convertor.getConverterKmToMl(km) + arrayString[1] + " \n");
                Thread.sleep(1000);
            } else if (choice.equals(arrayString[1])) {
                int ml = Integer.parseInt(scanner.next());
                System.out.println(ml + arrayString[1] + " = " + Convertor.getConverterMlToKm(ml) + arrayString[0] + " \n");
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}