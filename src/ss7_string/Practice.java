package ss7_string;

public class Practice {
    public static void main(String[] args) {
        int a = 2;

        String str1 = "Nguyễn Ngọc Quang";
        String str2 = "Nguyễn Ngọc Quang";
        String str3 = new String("Nguyễn Ngọc Quang");

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2));  // true

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}
