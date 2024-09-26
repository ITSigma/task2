package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class LastPositiveElement {
    public static final Random random = new Random();
    public static final Scanner scanner = new Scanner(System.in);

    public static void solve() {
        System.out.print("Elements count: ");
        var n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid value: Count < 0.");
            return;
        }

        var elements = getArray(n);
        System.out.println("Elements: " + Arrays.toString(elements));

        var result = findLastPositive(elements);

        if (result >= 0) {
            System.out.println("Array's last positive element: " + result);
        } else {
            System.out.println("Array hasn't positive element.");
        }
    }

    private static int[] getArray(int n) {
        var elements = new int[n];

        for (var i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt();
        }

        return elements;
    }

    private static int findLastPositive(int[] elements) {
        var lastPositive = -1;
        for (var element : elements) {
            if (element > 0) {
                lastPositive = element;
            }
        }

        return lastPositive;
    }
}
