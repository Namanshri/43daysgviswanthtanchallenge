public import java.io.*;
import java.util.*;

public class day35 {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int next = n + 1;
        while (!isPrime(next)) next++;
        if (next == m) System.out.println("YES");
        else System.out.println("NO");
    }
}
 
