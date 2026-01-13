package ss4_conditional_structure;

public class Main {
    public static void main(String[] args) {
        /*
        Student classification

        score < 5: Weak
        score >= 5: Fair
         */
        double score = 6;
        // way 1
        if (score < 5) {
            System.out.println("Weak");
        }

        if (score >= 5) {
            System.out.println("Fair");
        }

        // way 2
        if (score < 5) {
            System.out.println("Weak");
        } else {
            System.out.println("Fair");
        }
    }
}
