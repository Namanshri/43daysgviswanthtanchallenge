import java.io.*;
import java.util.*;

public class day36 {
    static boolean isLucky(int x) {
        String s = String.valueOf(x);
        for (char c : s.toCharArray()) {
            if (c != '4' && c != '7') return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= n; i++) {
            if (isLucky(i) && n % i == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
