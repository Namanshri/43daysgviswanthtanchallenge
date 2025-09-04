import java.io.*;
import java.util.*;

public class day29 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();
        int a = 0, d = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') a++;
            else d++;
        }
        if (a > d) System.out.println("Anton");
        else if (d > a) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
