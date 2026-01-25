package ss6_method;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(gcdWay3(0, -4));
    }

    public static void linear(double a, double b) {
        if (a == 0) {
            System.out.println((b == 0) ? "The equation has infinitely many solutions." : "The equation has no solution.");
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    public static void quadraticWay1(double a, double b, double c) {
        if (a == 0) {
            linear(b, c);
            return; // end method
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no real solutions.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void quadraticWay2(double a, double b, double c) {
        if (a == 0) {
            linear(b, c);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("The equation has no real solutions.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has 2 solutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    //c. Check whether the number is a perfect square
    public static boolean isSquare(int n) {

        return (double) n == (Math.sqrt(n) * Math.sqrt(n));
    }

    //c. Check whether the number is a perfect square
    public static boolean isSquareWay2(int n) {
        double squareRoot = Math.sqrt(n);
        return (double) n == squareRoot * squareRoot;
    }

    public static boolean isPrime(int n) { // n = 3
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) { // i <= 1
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int gcd(int a, int b) {
        int max = 0;
        for (int i = 1; i <= Math.min(a, b); i++) { // min times
            if ((a % i == 0) && (b % i == 0)) {
                max = i;
            }
        }
        return max;
    }

    public static int gcdWay2(int a, int b) {
        int max = 0;
        for (int i = Math.min(a, b); true; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                max = i;
                break; //
            }
        }
        return max;
    }

    /*
    -10 % 5
    10 % 5
     */
    public static int gcdWay3(int a, int b) { // a = 0
        int min = Math.min(Math.abs(a), Math.abs(b));

        if (min == 0) {
            return 1;
        }
        for (int i = min; true; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                return i;
            }
        }
    }
}
