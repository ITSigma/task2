package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String chooseMessage = """
        Choose an option:
        0. EXIT
        1. LastPositiveElement
        2. SelectionSort
        """;

    public static void main(String[] args) {
        while (true) {
            System.out.print(chooseMessage);
            var choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exit...");
                break;
            }

            switch (choice) {
                case 1: {
                    LastPositiveElement.solve();
                    break;
                }

                case 2: {
                    SelectionSort.solve();
                    break;
                }

                default:{
                    break;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
