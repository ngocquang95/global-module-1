package ss6_method;

/**
 * b. Write a method to solve a linear equation (first-degree equation).
 */
public class Exercise1B {
    public static void main(String[] args) {

    }

    public static void linearEquation(double a, double b) {
        if (a == 0) { // miss return when a == 0
            if (b == 0) {
                System.out.println("Infinitely many solution");
                // return "Infinitely many solution";
            } else {
                System.out.println("No solution");
                // return "No solution";
            }
        } else {
             System.out.println("A solution: " + (-b / a));
            // return String.valueOf(-b / a);
        }
    }
}
