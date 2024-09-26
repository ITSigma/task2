package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class SelectionSort {
    public static final Random random = new Random();
    public static final Scanner scanner = new Scanner(System.in);

    public static void solve() {
        System.out.print("Elements count: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid value: Count < 0.");
            return;
        }

        var elements = getArrayList(n);
        System.out.println("Elements: " + elements);

        selectionSort(n, elements);
        System.out.println("Sorted elements: " + elements);
    }

    private static ArrayList<Double> getArrayList(int n) {
        var elements = new ArrayList<Double>(n);

        for (int i = 0; i < n; i++) {
            double value = random.nextInt() + random.nextDouble();
            elements.add(value);
        }

        return elements;
    }

    private static void selectionSort(int n, ArrayList<Double> elements) {
        for (var i = 0; i < n; i++) {
            var minIndex = i;
            for (var j = i + 1; j < n; j++) {
                if (elements.get(j) < elements.get(minIndex)) {
                    minIndex = j;
                }
            }
            sortSwap(elements, minIndex, i);
        }
    }

    private static void sortSwap(ArrayList<Double> elements, int firstIndex, int secondIndex) {
        var temp = elements.get(firstIndex);
        elements.set(firstIndex, elements.get(secondIndex));
        elements.set(secondIndex, temp);
    }
}
