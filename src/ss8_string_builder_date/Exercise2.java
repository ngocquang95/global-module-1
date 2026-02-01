package ss8_string_builder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
//        a. Convert the string "02/28/2023" to the java.util.Date type.
        String dateStr = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(dateStr);
        System.out.println(date);


//        b. Convert the current system date (of type java.util.Date)
//        to a String with the format dd/MM/yyyy and display it.
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr2 = sdf2.format(new Date());
        System.out.println("current date: " + dateStr2);


//                c. Convert the string "02/28/2023" to LocalDate.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse("02/28/2023", formatter);
        System.out.println(localDate.format(formatter));

//        d. Convert the current system date (of type LocalDate)
//        to a String with the format dd/MM/yyyy and display it.
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Current date: " + now.format(formatter1));

//                e. Get the current day, month, year, hour, minute, and second of the system.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Day: " + localDateTime.getDayOfMonth());
        // System.out.println("Day: " + localDateTime.getDayOfWeek());
        System.out.println("Month: " + localDateTime.getMonth().getValue());
        System.out.println("Year: " + localDateTime.getYear());

//        f. Find out: What day of the week it will be one month from today, and How many days it is from today.
//                Hint: If today is 26/06, then one month later is understood as 26/07 (same day, plus one month).
//        g. Find out the date that was 1000 days ago from today.
//        h. Input two strings in the format dd/MM/yyyy. Convert them to two LocalDate objects, then calculate the number of days between the two dates.
//                i. Input one string in the format dd/MM/yyyy, then input a natural number n. Print the date that is n days after the given date.
    }
}
