import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static final String TLP_REGEX = "[(][0-9]{2}[)]+[-]+[(][0-9]{10}[)]";
    public TelephoneExample() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(TLP_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
