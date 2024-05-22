import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelWordsFinder {
    public static void main(String[] args) {
        String inputString = "Java is an amazing programming language with many vowels.";
        String regex = "\\b[AEIOUaeiou][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("Words starting with a vowel:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}