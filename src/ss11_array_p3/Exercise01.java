package ss11_array_p3;


import util.ArrayUtil;
import util.InputUtil;
import util.NumberUtil;

import java.util.Arrays;
import java.util.Scanner;

/*
Array Processing Operations
Problem
Perform the following operations on a one-dimensional array a:

a. Extract all prime numbers from array a and store them in array b.
b. Split array a into two arrays:
    • b contains positive integers // build method 1 > 0
    • c contains the remaining elements // build method 2
c. Sort the array in descending order.
d. Sort the array so that:
    • Positive numbers come first in descending order
    • Negative numbers come next in ascending order
    • Zeros come last
e. Reverse the order of elements in array a.
f. Check whether array a is a palindrome array.
     Example of a palindrome array: {1, 2, 4, 7, 3, 7, 4, 2, 1}
g. Count the number of symmetric pairs in the array.
     Example: {1, 2, 8, 7, 3, 7, 4, 2, 1}
          This array has 3 symmetric pairs.
 */
public class Exercise01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // a = [1, 2, 3, 4, 5] => [2, 3, 5]
        int[] arr = {1, 2, 3, 4, 5, -3, -6, 0};

        System.out.println("Way 1: " + Arrays.toString(extractPrime(arr)));
        System.out.println("Way 2: " + Arrays.toString(extractPrime2(arr)));

//    • Positive numbers come first in descending order
//    • Negative numbers come next in ascending order
        System.out.println("b");
        System.out.println("Positive: " + Arrays.toString(extractPositive(arr)));
        System.out.println("Remaining: " + Arrays.toString(extractRemaining(arr)));
        sortDescending(arr);
        System.out.println("Sort: " + Arrays.toString(arr));

//        int[] a = inputArray("Please enter length n of the array (n > 0): ");
//        printMenu();
//        int choice = InputUtil.readInt("Please choose an option: ", 7);
//        switch (choice) {
//            case 0:
//                break;
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            default:
//                System.out.println("Invalid input. You must enter an integer from 0-7.");
//        }


    }

    private static void printMenu() {
        System.out.println("=== Array Processing Operation ===");
        System.out.println("1) Extract all prime numbers from array a and store them in array b.");
        System.out.println("2) Split array a into two arrays:\n" +
                "    • b contains positive integers\n" +
                "    • c contains the remaining elements");
        System.out.println("3) Sort the array in descending order.");
        System.out.println("4) Sort the array so that:\n" +
                "    • Positive numbers come first in descending order\n" +
                "    • Negative numbers come next in ascending order\n" +
                "    • Zeros come last");
        System.out.println("5) Reverse the order of elements in array a.");
        System.out.println("6) Check whether array a is a palindrome array.");
        System.out.println("7) Count the number of symmetric pairs in the array.");
        System.out.println("0) Exit");
    }

    private static int[] inputArray(String prompt) {
        int n = InputUtil.readInt(prompt, 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = InputUtil.readInt("a[" + i + "] = ");
        }
        return a;
    }

    // a. Extract all prime numbers from array a and store them in array b.
    private static int[] extractPrime(int[] arr) { // Way 1
        // Step 1: count number of prime
        int count = 0;
        for (int value : arr) { // foreach
            if (NumberUtil.isPrime(value)) {
                count++;
            }
        }

        // Step 2: new Array b with length = count number of prime
        int[] brr = new int[count];

        // Step 3: Copy the all prime to the array b
        int j = 0;
        for (int value : arr) {
            if (NumberUtil.isPrime(value)) {
                brr[j++] = value;
            }
        }

        // Step 4: return b
        return brr;
    }

    private static int[] extractPrime2(int[] arr) { // way 2
        int[] brr = new int[0]; // [] => length = 0

        // Step 3: Copy the all prime to the array b
        for (int value : arr) { // [1, 2, 3, 4, 5]
            if (NumberUtil.isPrime(value)) {
                brr = ArrayUtil.add(brr, value);
            }
        }

        // Step 4: return b
        return brr;
    }

    //    b. Split array a into two arrays:
//            • b contains positive integers // build method 1
    private static int[] extractPositive(int[] arr) { // way 2
        int[] brr = new int[0]; // [] => length = 0

        // Step 3: Copy the all prime to the array b
        for (int value : arr) { // [1, 2, 3, 4, 5]
            if (value > 0) {
                brr = ArrayUtil.add(brr, value);
            }
        }

        // Step 4: return b
        return brr;
    }

    // c contains the remaining elements // build method 2
    private static int[] extractRemaining(int[] arr) { // way 2
        int[] brr = new int[0]; // [] => length = 0

        // Step 3: Copy the all prime to the array b
        for (int value : arr) { // [1, 2, 3, 4, 5]
            if (value <= 0) {
                brr = ArrayUtil.add(brr, value);
            }
        }

        // Step 4: return b
        return brr;
    }

    // a. Extract all prime numbers from array a and store them in array b.
//    private static int[] extractRemaining2(int[] arr) { // Way 1
//        // Step 1: count number of Remaining
//        int count = 0;
//        for (int value : arr) { // foreach
//            if (value > 0) {
//                count++;
//            }
//        }
//
//        // Step 2: new Array b with length = count number of prime
//        int[] brr = new int[count];
//        int[] crr = new int[arr.length - count];
//
//        // Step 3: Copy the all prime to the array b
//        int j = 0;
//        for (int value : arr) {
//            if (value <= 0) {
//                crr[j++] = value;
//            }
//        }
//
//        // Step 4: return b
//        return crr;
//    }
    // Sort the array in descending order.
    public static void sortDescending(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}