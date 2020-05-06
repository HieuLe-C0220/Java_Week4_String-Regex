import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}+[G-M]";//giới hạn ký tự nếu là 1 thì k cần ghi
    public ClassExample() {
        pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
