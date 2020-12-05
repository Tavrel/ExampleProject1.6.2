import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regular {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("a..a");
        Matcher matcher = pattern.matcher(text);
    }
}
