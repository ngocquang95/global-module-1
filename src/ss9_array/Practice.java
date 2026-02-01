package ss9_array;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr2 = {10, 20, 30};

        int[] arr = new int[]{1, 2, 30};

        // Way 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Way 2: foreach?
        for (int value : arr) {
            System.out.println(value);
        }

        // Way 3:Array
        System.out.println(Arrays.toString(arr));
        System.out.println(arr); // address
    }
}
