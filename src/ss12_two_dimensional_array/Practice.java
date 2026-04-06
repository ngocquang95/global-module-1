package ss12_two_dimensional_array;

import util.InputUtil;

import java.util.Scanner;

public class Practice {
    static Scanner scanner = new Scanner(System.in);

    //
    static void main() {
//        int[][] arr = new int[][]{
//                {10, 20},
//                {30, 40, 50},
//                {60}
//        };

        // input
        // Step 1: input row, column => condition must > 0
        int row = InputUtil.inputPositive("row");
        int column = InputUtil.inputPositive("column");

        // Step 2: create array
        int[][] arr = new int[row][column];

        // Step 3: input each element
        input(arr);

        output(arr);

        System.out.println("After swap");
        swap(arr, 0, 2);
        output(arr);

        scanner.close();
    }

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { // column
                System.out.printf("Enter a[%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void output(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { // column
                System.out.print(arr[i][j] + "\t"); // tab
            }
            System.out.println(); // new line
        }
    }

    // Check whether the array contains only even numbers
    public static boolean isAllEven(int[][] arr) { // Even => odd
//        for (int i = 0; i < arr.length; i++) { // row
//            if (!isAllEven(arr[i])) {
//                return false;
//            }
//        }
        for (int[] ints : arr) { // row
            if (!isAllEven(ints)) {
                return false;
            }
        }
        // foreach?

        return true;
    }

    // 2a. Check whether array contains only even numbers
    public static boolean isAllEven(int[] a) {
        for (int v : a) {
            // if (v % 2 != 0) return false; // Javascript
            if (v % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // Create a one-dimensional array X,
    // where X[i] is the maximum value of row i in matrix A. Print array X
    public static int[] findMax(int[][] arr) {
        int[] x = new int[arr.length];

        for (int i = 0; i < arr.length; i++) { // row
            x[i] = findMax(arr[i]);
        }

        return x;
    }

    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Swap two rows of the matrix
    public static void swap(int[][] arr, int row1, int row2) {
        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }

}
