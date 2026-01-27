package ss8_string_builder_date;

import java.time.LocalDate;

public class Practice4 {
    public static void main(String[] args) {
        // Find next date?
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.plusDays(-1));

        // dd/MM/yyyy
    }
}
