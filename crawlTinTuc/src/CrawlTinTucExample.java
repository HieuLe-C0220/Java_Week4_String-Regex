import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlTinTucExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/xa-hoi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            //xoá tất cả dòng mới
            content = content.replaceAll("\\n","");
            //regex
            Pattern name = Pattern.compile("href=\"(.*?)\">(.*?)</a>");
            Matcher m = name.matcher(content);
            while (m.find()) {
                System.out.println(m.group(2));
                System.out.println("https://dantri.com.vn"+m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
