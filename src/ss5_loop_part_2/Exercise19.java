package ss5_loop_part_2;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be positive.");
            scanner.close();
            return;
        }

        //Check palindrome
        boolean isPalindrome = true;
        int reversed = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (reversed != n) {
            isPalindrome = false;
        }

        //Check prime
        boolean isPrime = true;

        if (n == 1) {
            isPrime = false;
        } else {
            // [n/2 + 1: n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        //Check increasing digits
        boolean isIncreasing = true;
        temp = n;
        int previousDigit = 10;

        while (temp > 0) {
            int currentDigit = temp % 10;

            if (currentDigit >= previousDigit) {
                isIncreasing = false;
                break;
            }

            previousDigit = currentDigit;
            temp /= 10;
        }

        System.out.println();
        System.out.println("Palindrome number: " + isPalindrome);
        System.out.println("Prime number: " + isPrime);
        System.out.println("Digits in increasing order: " + isIncreasing);

        scanner.close();
    }
}
