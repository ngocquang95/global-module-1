package util;

import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String sInt = scanner.nextLine().trim();
            try {
                return Integer.parseInt(sInt);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer only!");
            }
        }
    }

    public static int readInt(String prompt, int minimum) {
        while (true) {
            System.out.print(prompt);
            String sInt = scanner.nextLine().trim();
            try {
                int iParsed = Integer.parseInt(sInt);
                // Case 1: Array =>
                if (iParsed <= minimum) { // <=
                    System.out.println("Invalid input! Please enter a positive integer.");
                    continue;
                }
                return iParsed;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer only!");
            }
        }
    }


    public static int readInt(String prompt, int start, int end) { // [0-5]   ,  <= 0
        while (true) {
            System.out.print(prompt);
            String sInt = scanner.nextLine().trim();
            try {
                int iParsed = Integer.parseInt(sInt);
                if (iParsed <= start || iParsed >= end) { // <=
                    System.out.printf("Invalid input! The value [%s - %s], Please re-enter.!\n", start, end);
                    continue;
                }
                return iParsed;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer only!");
            }
        }
    }

    public static int inputPositive(String target) { // target = column
        int n;
        do {
            System.out.printf("Enter number of %s (%s > 0): ", target, target);
            n = scanner.nextInt();

            if (n < 0) {
                System.out.printf("%s must be > 0, please type again!", target);
            }
        } while (n < 0);
        return n;
    }
}
