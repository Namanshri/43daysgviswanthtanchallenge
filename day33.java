import java.io.*;
import java.util.*;

public class day33 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim();
        String b = br.readLine().trim();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) ans.append('0');
            else ans.append('1');
        }
        System.out.println(ans.toString());
    }
}
