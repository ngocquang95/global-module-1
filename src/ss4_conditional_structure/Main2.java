package ss4_conditional_structure;

public class Main2 {
    public static void main(String[] args) {
        /*
        Student classification

        score < 5: Weak
        score >= 5 and score < 8: Fair
        score >= 8: Good
         */
//        double score = 11; // [0 - 10]
//        // score == 11 => sout "score is invalid"
////        if(score > 10) {
////            System.out.println("Score is invalid");
////        }
//
//        if(score >= 8 && score <= 10) {
//            System.out.println("Good");
//        } else if(score >= 5) {
//            System.out.println("Fair");
//        } else if(score >= 0) {
//            System.out.println("Weak");
//        } else {
//            System.out.println("Score is invalid");
//        }


        double score = 11; // [0 - 10]
        // score == 11 => sout "score is invalid"
        if (score < 0 || score > 10) {
            System.out.println("Score is invalid");
        } else if (score >= 8) {
            System.out.println("Good");
        } else if (score >= 5) {
            System.out.println("Fair");
        } else {
            System.out.println("Weak");
        }
    }
}
