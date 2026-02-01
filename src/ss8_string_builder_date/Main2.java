package ss8_string_builder_date;

public class Main2 {
    public static void main(String[] args) {
        //b. Given the string "Hello World" → Replace the character 'o' with 'f' using StringBuffer and StringBuilder.
        StringBuffer str3 = new StringBuffer("Hello World");

        for(int i = 0; i < str3.length(); i++) {
            if(str3.charAt(i) == 'o') { // Get char at index
                str3.setCharAt(i, 'f'); // update o at index to 'f'
            }
        }
        System.out.println("b) StringBuffer: " + str3);
    }
}
