package ss13_array_list;

import util.InputUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        // Exercise 1: Input and output operations
        // Step 1: input n
        int n = InputUtil.inputPositive("n");
        ArrayList<Integer> integers = new ArrayList<>();

        // Step 2: build method input
        input(integers, n);

        // Step 3: build method output
        System.out.println(integers);
    }

    public static void input(ArrayList<Integer> integers, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("Input element %d: ", i);
            integers.add(scanner.nextInt());
        }
    }

    // Exercise 2: Validation operations
    // Check whether the array contains only even numbers
    public static boolean isAllEven(ArrayList<Integer> a) {
        for (int v : a) {
            if (v % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // Exercise 3: Calculation operations
    //Calculate the sum of positive odd numbers in array a
    public static int sumOddPositive(ArrayList<Integer> a) {
        int sum = 0;
        for (int v : a) {
            if (v >= 0 && v % 2 != 0) {
                sum += v;
            }
        }
        return sum;
    }
}
