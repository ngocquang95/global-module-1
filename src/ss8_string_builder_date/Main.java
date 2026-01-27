package ss8_string_builder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

//        // Enter date of birth from the keyboard
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        simpleDateFormat.setLenient(false);
//
//        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
//        String str = scanner.nextLine().trim();
//
//        Date dateOfBirth = simpleDateFormat.parse(str);
//
//        System.out.println("Your date of birth: " + simpleDateFormat.format(dateOfBirth));
//
//
        Date date = new Date();

        System.out.println(date.getTime());
        long currentTime = date.getTime();

//        while (true) {
//            System.out.println( date.getTime() / 1000 - currentTime / 1000);
//        }
    }
}
