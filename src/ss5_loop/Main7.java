package ss5_loop;


import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // Print the Fibonacci sequence: 1, 2, 3, 5, 8, 13, … n.
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the Fibonacci sequence: 1, 2, 3, 5, 8, 13, … n.
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        // n = 10
        while (fn <= n) { // 1 <= 10 => true
            System.out.print(fn + "\t"); // 1
            // how can i change fn? //
            f1 = f2; // f1 = 2
            f2 = fn; // f2 = 2
            fn = f1 + f2; // fn = 2 + 2 = 4
        }
    }
}
