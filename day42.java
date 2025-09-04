import java.io.*;
import java.util.*;

public class day42 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        if (n % 2 == 0) System.out.println(n / 2);
        else System.out.println(-(n + 1) / 2);
    }
}
