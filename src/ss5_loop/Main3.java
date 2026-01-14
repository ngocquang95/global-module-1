package ss5_loop;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Print the sequence: 2, -4, 6, -8, 10 … n, where n is an integer entered from the keyboard. (*)
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the sequence: 2, -4, 6, -8, 10 … n,
        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "\t");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
