package ss5_loop;


import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        // Calculate the Sum S = 1 + 1/2 + 1/3 + … + 1/n
        Scanner scanner = new Scanner(System.in);

        long n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextLong();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Calculate the Sum S = 1 + 1/2 + 1/3 + … + 1/n
        double s = 0;

        // n = 2
        for (int i = 1; i <= n; i++) { // 1 <= 2
            s += 1.0 / i; // s = 1 / 1 = 1
        }

        System.out.println("s = " + s); // n = 2 => s = 1.5

    }
}
