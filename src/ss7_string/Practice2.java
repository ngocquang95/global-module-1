package ss7_string;

public class Practice2 {
    /*
    Fullname
     */
    private static String fullName1;

    /*
    Fullname
     */
    private static String gender1;
    private static int age1;
    private static double basicSalary1, gpa1;

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("Hello");

        System.out.println(str1 == str2); // false
        System.out.println(str1.toString().equals(str2.toString())); // true
    }
}
