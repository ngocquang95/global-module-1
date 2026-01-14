package ss5_loop;


import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        // Print the number sequence: 1, -3, 7, -15, 31, … n. where n is a number entered from the keyboard.
        Scanner scanner = new Scanner(System.in);

        long n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextLong();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the number sequence: 1, -3, 7, -15, 31, -33  … n.

        long result = 1;
        while (result <= n) {
            if (result % 3 == 0) {
                System.out.print(-result + "\t");
            } else {
                System.out.print(result + "\t");
            }
            result = result * 2 + 1;
        }
    }
}
