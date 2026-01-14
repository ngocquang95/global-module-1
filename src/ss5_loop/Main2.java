package ss5_loop;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Print the sequence 1, 3, 5, 7, 9 … n, where n is an integer entered from the keyboard.
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the sequence 1, 3, 5, 7, 9 … n,
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
