package ss6_method;

public class Example {
    public static void main(String[] args) {
         /*
         Syntax of the method

        <Access modifier> <static/non-static> <Return type> <Method name> (Parameter List) {
            // Body
        }

        <Return type>:
            + Has a return type => must contain a return
            + No return value: void

         Example: Build a method to calculate sum of 2 numbers (double)
         */

        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println("=== Way1 ===");
        System.out.println("Sum: " + calculateSum(calculateSum(a, b), c));

        System.out.println("=== Way2 ===");
        calculateSum2(a, b);
    }

    // Way 1
    public static double calculateSum(double a, double b) { // reusable
        return a + b;
    }

    // Way 2
    public static void calculateSum2(double a, double b) { // Not reusable
        System.out.println("Sum: " + (a + b));
    }

}
