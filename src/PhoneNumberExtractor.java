import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        String input = "+375(29)******* 80********* +375(33)******* +375(44)*******";
        extractBelarusPhoneNumbers(input);
    }

    public static void extractBelarusPhoneNumbers(String input) {
        Pattern pattern = Pattern.compile("\\+375\\d{9}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String phoneNumber = matcher.group();
            System.out.println("Найден номер: " + phoneNumber);
        }
    }
}
