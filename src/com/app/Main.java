package com.app;

import com.utils.Convertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int operationNumber = 0;

        while (flag) {
            System.out.println("Program: Convertor Distance \n" +
                    "please choose (write) 1,2 or 3 \n" +
                    "1. conversion km to ml \n" +
                    "2. conversion ml to km \n" +
                    "3. exit");
            try {
                operationNumber = Integer.parseInt(scanner.next()); //choose function 1,2,3
            } catch (Exception e) {
                System.out.println("Invalid data");
            }

            switch (operationNumber) {
                case 1 -> {
                    try {
                        pleaseWrite();
                        int km = Integer.parseInt(scanner.next());
                        System.out.println(km + " km = " + Convertor.getConverterKmToMl(km) + " miles \n");
                    } catch (Exception e) {
                        System.out.println("Invalid data");
                    }
                }
                case 2 -> {
                    pleaseWrite();
                    try {
                        int ml = Integer.parseInt(scanner.next());
                        System.out.println(ml + " ml = " + Convertor.getConverterMlToKm(ml) + " kilometres \n");
                    } catch (Exception e) {
                        System.out.println("Invalid data");
                    }
                }
                case 3 -> {



                    flag = false;
                }
                default -> {
                    System.out.println("No operation,Try again. \n");
                }
            }
        }
