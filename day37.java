import java.io.*;
import java.util.*;

public class day37 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine().trim();
        if (p.contains("H") || p.contains("Q") || p.contains("9"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
