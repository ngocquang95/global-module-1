package ss10_array_p2;

import ss9_array.Main;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // [1, 2, 0, 3, 0, 4, 5, 0]

        arr = addTheValueAfterPrime(arr, 0);

        System.out.println(Arrays.toString(arr)); // [20, 30]
    }

    public static int[] add(int[] arr, int value) {
        // add value 100 => end arr => [10, 20, 30, 100]
        // Step 1: Create a new memory area with a size equal to the old array length + 1.
        int[] brr = new int[arr.length + 1];

        // Step 2: Copy the values from the old array to the new array.
        for(int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        //  Step 3: Assign the element to be added to the last position of the new array.
        // brr[brr.length - 1] = 100;
        brr[arr.length] = value;

        // Bước 4: Make the original array variable reference the new memory area.
        return brr;
    }

    public static int[] add(int[] arr, int value, int index) {
        // add value 100 => end arr => [10, 20, 30, 100]
        // Step 1: Create a new memory area with a size equal to the old array length + 1.
        int[] brr = new int[arr.length + 1];

        // Step 2: Copy the values from the old array to the new array.
        // Green
        for(int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        // Blue
        for(int i = index; i < arr.length; i++) {
            brr[i + 1] = arr[i];
        }

        //  Step 3: Assign the element to be added to the last position of the new array.
        // brr[brr.length - 1] = 100;
        brr[index] = value;

        // Bước 4: Make the original array variable reference the new memory area.
        return brr;
    }

    public static int[] delete(int[] arr, int index) {
        int[] brr = new int[arr.length - 1];

        for(int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        for(int i = index; i < brr.length; i++) {
            brr[i] = arr[i + 1];
        }

        return brr;
    }

    public static int[] deleteElement(int[] arr, int element) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) { // true
                arr = delete(arr, i);
                i--; // important
            }
        }

        return arr;
    }

    public static int[] addTheValueAfterPrime(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(Main.isPrime(arr[i])) { // true
                arr = add(arr, value, i + 1);
                i++; // important
            }
        }

        return arr;
    }
}
