package ss9_array;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        /*
        Miền giá trị của arr là {10, 20, 30}

        arr là {10, 20, 30}
         */
        int[] a = {10, 20, 30};

        System.out.println("value: " + a);
        changeData(a);
        System.out.println("value: " + a);

        System.out.println(Arrays.toString(a)); // 10 100 30
    }

    static void changeData(int[] arr) {
        arr[1] = 100;
        arr = new int[]{1, 2, 3};
    }
}
