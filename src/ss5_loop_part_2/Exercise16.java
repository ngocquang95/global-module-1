package ss5_loop_part_2;

public class Exercise16 {
    public static void main(String[] args) {
        /*

        Shape A
        *  => i = 1 => inner loop => loops 1 time
        ** => i = 2 => inner loop => loop 2 times
        *** => i = 3 => inner loop => loop 3 times
        ****
        *****
         */

        int length = 5;
        System.out.println("Shape A");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = 1; j <= i; j++) { // i = 2 =>
                System.out.print("*");
            }

            System.out.println();
        }


        /*

        Shape B
        *****  => i = 1 => inner loop => loops length times
        ****   => i = 2 => inner loop => loops length - 1 times
        ***    => i = 3 => inner loop => loops length - 2 times
        **
        *
         */

        System.out.println("\nShape B");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = length; j >= i; j--) { // i = 1 => j = 5 -> 1 => 5 times
                System.out.print("*");
            }

            System.out.println();
        }

        /*
        Shape C
                *
               **
              ***
             ****
            *****
         */

        System.out.println("\nShape C");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = length; j > i; j--) { // i = 1 => j = 5 -> 1 => 5 times
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // i = 2 =>
                System.out.print("*");
            }

            System.out.println();
        }

         /*
        Shape D
            *****
             ****
              ***
               **
                *
         */

        System.out.println("\nShape D");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = 1; j < i; j++) { // i = 1 => j = 0 -> 1 => 2 times => 2 spaces
                System.out.print(" ");
            }

            for (int j = length; j >= i; j--) { // i = 2 =>
                System.out.print("*");
            }

            System.out.println();
        }

         /*
        Shape E
            * * * * *
            *     *
            *   *
            * *
            *
         */

        System.out.println("\nShape E");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = 1; j <= length; j++) {
                if (i == 1 || j == 1 || j == length - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println("\nShape F");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = length; j > i; j--) { // i = 1 => j = 5 -> 1 => 5 times
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) { // i = 2 =>
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nShape G");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = 1; j < i; j++) { // i = 1 => j = 0 -> 1 => 2 times => 2 spaces
                System.out.print(" ");
            }

            // length = 4
            for (int j = 2 * length - 1; j > 2 * (i - 1); j--) {
                // i = 1 => 7 * => 7 -> 1
                // i = 2 => 5 *
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
