package com.app;

import com.utils.Convertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int operationNumber = 0;

        while (flag) {
            System.out.println("""
                    Program: Convertor Distance\s
                    please choose (write) 1,2 or 3\s
                    1. conversion km to ml\s
                    2. conversion ml to km\s
                    3. exit""");
            try {
                operationNumber = Integer.parseInt(scanner.next()); //choose function 1,2,3
            } catch (Exception e) {
                System.out.println("Invalid data");
            }

            switch (operationNumber) {
                case 1 -> Convertor.bodyFunction(scanner, "km");
                case 2 -> Convertor.bodyFunction(scanner, "ml");
                case 3 -> flag = false;
                default -> System.out.println("No operation,Try again. \n");
                }
            }
        }
}