import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class petyanstrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        int compare = c.compareTo(d);
        if (compare < 0) {
            System.out.println("-1");
        }
        else if (compare > 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
