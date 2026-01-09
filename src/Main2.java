import java.util.Scanner;

public class Main2 {
    // main enter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input score: ");
        double score = Double.parseDouble(scanner.nextLine()); // 6.0 enter
        // int age = Integer.parseInt(scanner.nextLine());

         // scanner.nextLine(); // way 1 => remove buffer
        // way 2?
        System.out.print("Input name: ");
        String name = scanner.nextLine(); // enter

        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        /*
        type int: byte, short, int, long?
         */
        // byte: 1byte = 8bits =>
        // 2^8 = 256 -> [-128:127]
        byte b = 127;
        int i = 2094967296;
        long l = 20949672960L;
        // short: 2byte = 16bits =>
        float f = 2.0F;
        double d = 2.0;
        /*
        Step 1: git add .
        Step 2: git commit -m "Your message"
        Step 3: git push
         */
    }
}
