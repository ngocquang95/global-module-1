package ss4_conditional_structure;

public class Main3 {
    public static void main(String[] args) {
        /*
        Enter a number 2-8 => print day of week
         */
        int day = 3;

        switch (day) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        switch (day) {
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            default -> System.out.println("Weekend");
        }
    }
}
