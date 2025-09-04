import java.io.*;
import java.util.*;

public class day28 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = Long.parseLong(st.nextToken());
        int[] L = new int[n];
        int[] R = new int[n];
        for (int i = 1; i < n; i++) {
            if (h[i - 1] <= h[i]) L[i] = L[i - 1] + 1;
            else L[i] = 0;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (h[i + 1] <= h[i]) R[i] = R[i + 1] + 1;
            else R[i] = 0;
        }
        int best = 0;
        for (int i = 0; i < n; i++) {
            best = Math.max(best, L[i] + 1 + R[i]);
        }
        System.out.println(best);
    }
}
