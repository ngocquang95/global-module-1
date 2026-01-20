package ss5_loop_part_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();

        System.out.println("You entered: a = " + a + ", b = " + b);
        //placeholder
        // way 1
//        int c = 0; // Not use placeholder (Not use temporary)
//
//        c = a;
//        a = b;
//        b = c;

        /*
        Example
        a = 5
        b = 10
         */
        // way 2 // + => * and - => /
        a = a + b; // a = 15 // (a= 15, b = 10)
        b = a - b; // b = 15 - 10 = 5 (a= 15, b = 5)
        a = a - b; // c = 15 - 5 = 10  (a= 10, b = 5)

        System.out.println("Swapped: a = " + a + ", b = " + b);

        scanner.close();
    }
}
