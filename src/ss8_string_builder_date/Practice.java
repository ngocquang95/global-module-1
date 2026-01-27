package ss8_string_builder_date;

public class Practice {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();

        for(int i = 1; i <= 10; i++) {
            str.append(i);
        }

        str.replace(1, 5, "");

        System.out.println(str);
    }
}
