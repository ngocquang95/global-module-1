package ss5_loop;


import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        // Print the number sequence: 1, 3, 7, 15, 31, … n. where n is a number entered from the keyboard.
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Input n (n >= 0): ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be >= 0, please type again!");
            }
        } while (n < 0);

        // Print the number sequence: 1, 3, 7, 15, 31, … n.

        boolean isReverseSign = false;
        int result = 1;
        while (result <= n) { // 1 <= 10 => true //   for (;condition;) => while(condition)
            if (isReverseSign) {
                System.out.print(-result + "\t");
            } else {
                System.out.print(result + "\t");
            }
            isReverseSign = !isReverseSign;
            result = result * 2 + 1;
        }
    }
}
