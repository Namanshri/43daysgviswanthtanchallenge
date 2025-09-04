import java.io.*;
import java.util.*;

public class day31 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String prev = br.readLine().trim();
        int groups = 1;
        for (int i = 1; i < n; i++) {
            String cur = br.readLine().trim();
            if (!cur.equals(prev)) groups++;
            prev = cur;
        }
        System.out.println(groups);
    }
}
