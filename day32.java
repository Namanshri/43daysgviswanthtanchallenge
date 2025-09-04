import java.io.*;
import java.util.*;

public class day32 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().trim();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '4' || c == '7') count++;
        }
        if (count == 4 || count == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}

