package ss5_loop_part_2;

public class Exercise18 {
    /*

     * * * * * *
     *         *
     *         *
     *         *
     *         *
     * * * * * *
     */
    public static void main(String[] args) {
        int side = 10;

        for(int i = 1; i <= side; i++) { // row
            for(int j = 1; j <= side; j++) { // column
                if(i == 1 || i == side || j == 1 || j == side || j == i || j == side - i + 1) { // i = 1 => row first
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // new row
        }
    }
}
