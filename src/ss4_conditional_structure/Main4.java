package ss4_conditional_structure;

public class Main4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int max = a > b ? a : b;
        int min = Math.min(a, b);

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
