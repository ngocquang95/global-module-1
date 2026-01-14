package ss5_loop;


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // Print the sequence 2, 4, 6, 8, 10 … 2n (n is a number entered from the keyboard). (*)
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the sequence 2, 4, 6, 8, 10 … 2n
        // n = 5 -> 2 4 6 8 10
        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
