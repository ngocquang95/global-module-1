package ss5_loop_part_2;

public class Exercise14 {
    /*

     * * * * * *
     *         *
     *         *
     *         *
     *         *
     * * * * * *
     */
    public static void main(String[] args) {
        int row = 4;
        int column = 5;

        for(int i = 1; i <= row; i++) { // row
            for(int j = 1; j <= column; j++) { // column
                if(i == 1 || i == row || j == 1 || j == column) { // i = 1 => row first
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // new row
        }
    }
}
