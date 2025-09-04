import java.io.*;
import java.util.*;

public class day40 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().trim().split(" ");
            int p = Integer.parseInt(parts[0]);
            int q = Integer.parseInt(parts[1]);
            if (q - p >= 2) count++;
        }
        System.out.println(count);
    }
}
