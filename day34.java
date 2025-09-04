import java.io.*;
import java.util.*;

public class day34 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[p[i]] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i]);
            if (i < n) System.out.print(" ");
        }
    }
}
