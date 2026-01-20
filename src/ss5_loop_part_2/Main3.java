package ss5_loop_part_2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve ax + b = 0");
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();


        if (a == 0) {
            if (b == 0) {
                System.out.println("x has indefinite solutions");
            } else {
                System.out.println("This equation has no solution");
            }
        } else {
            System.out.println("x = " + -b / a);
        }
        scanner.close();
    }
}
