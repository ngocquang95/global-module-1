package ss5_loop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the Sequence 1, 2, 3, 4, 5, ..., n (n >= 0)
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if(n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }
}
