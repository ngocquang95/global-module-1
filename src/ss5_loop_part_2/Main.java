package ss5_loop_part_2;

public class Main {
    /*

     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */
    // Ctrl + Alt + L: Format code
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { // row
            for (int j = 1; j <= 5; j++) { // column
                System.out.print("* ");
            }
            System.out.println(); // new row
        }
    }
}
