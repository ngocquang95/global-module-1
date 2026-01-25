package ss6_method;

/**
 * c. Write a method to solve a quadratic equation (second-degree equation).
 */
public class Exercise1C {
    public static void main(String[] args) {
        // double x = 2.129456789;

        // System.out.printf("sadasd = %.2f, %d", x, 2);
        /*
        %d: integer
        %f: float, double
        %c: char
        %s: String
         */
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        System.out.println("Hello world!!!");
        quadraticEquation(1, 20, 3);
        // x1: -19.848857801796104 => x1: -19.85
    }

    public static void quadraticEquation(double a, double b, double c) {
        if (a == 0) { // bx + c = 0 =>
            Exercise1B.linearEquation(b, c);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                System.out.printf("x1: %.2f\n", (-b - Math.sqrt(delta)) / (2 * a));
                // System.out.println();
                System.out.printf("x2: %.2f", (-b + Math.sqrt(delta)) / (2 * a));
            } else if (delta == 0) {
                System.out.printf("x: %.2f", -b / (2 * a));
            } else {
                System.out.println("No solution");
            }
        }
    }
}
