package ss5_loop_part_2;

public class Exercise17A {
    public static void main(String[] args) {
        int length = 5;
        System.out.println("Shape A");
        for (int i = 1; i <= length; i++) { // row => outer loop
            for (int j = 1; j <= length; j++) { // i = 2 =>
                if(i == 1 || i == length || j == length - i + 1) { // i = 2 => j = 5
                    System.out.print("* ");  //                    // i = 3 => j = 4
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
