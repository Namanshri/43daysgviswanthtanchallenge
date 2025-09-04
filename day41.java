import java.io.*;
import java.util.*;

public class day41 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().trim().split(" ");
            x += Integer.parseInt(parts[0]);
            y += Integer.parseInt(parts[1]);
            z += Integer.parseInt(parts[2]);
        }
        if (x == 0 && y == 0 && z == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
