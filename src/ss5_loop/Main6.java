package ss5_loop;


import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // Print the sequence 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the sequence 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
        int distance = 2; // change 1 -> 2
        int count = 0;

        for (int i = 2; i <= n; i += 2) {
            count++; // 1
            if (count == distance) { // true
                System.out.print(-i + "\t"); // -2
                count = 0;
                distance++;
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
