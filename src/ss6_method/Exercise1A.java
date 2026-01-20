package ss6_method;

import java.util.Scanner;

/**
 * a. Write a method to convert an uppercase character to a lowercase character.
 */
public class Exercise1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Hello WorLd!"; //= > hello world!

        String strLowerCase = "";

        for (int i = 0; i < str.length(); i++) {
            strLowerCase += toLowerCase(str.charAt(i));
        }

        System.out.println(strLowerCase);
    }

    /**
     * a. Write a method to convert an uppercase character to a lowercase character.
     */
    public static char toLowerCase(char c) {
        // if uppercase => uppercase + 32 (lowercase)
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }

        return c;
    }
}
