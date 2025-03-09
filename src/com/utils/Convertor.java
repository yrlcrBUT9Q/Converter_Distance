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


    public static void bodyFunction(Scanner scanner, String choice) {
        System.out.println("Please write distance:");
        try {
            if (choice.equals(arrayString[0])) {
                int km = Integer.parseInt(scanner.next());
                System.out.println(km + " km = " + Convertor.getConverterKmToMl(km) + " miles \n");
                Thread.sleep(1000);
            } else if (choice.equals(arrayString[1])) {
                int ml = Integer.parseInt(scanner.next());
                System.out.println(ml + " ml = " + Convertor.getConverterMlToKm(ml) + " kilometres \n");
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }
}