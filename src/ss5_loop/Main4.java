package ss5_loop;


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        // Print the sequence: 2, 4, -6, 8, 10, -12 … n using at least 2 different methods, where n is an integer entered from the keyboard.
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the sequence: 2, 4, -6, 8, 10, -12 … n
        int distance = 3;
        int count = 0;

        for (int i = 2; i <= n; i += 2) {
            count++; // 0, 1, 2, 3, 4, 5, 6, ...
            if (count == distance) {
                System.out.print(-i + "\t");
                count = 0;
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
