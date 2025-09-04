import java.io.*;
import java.util.*;

public class day39 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(arr[i]);
        int maxVal = -1, minVal = 101;
        int maxIdx = -1, minIdx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
                maxIdx = i;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < minVal) {
                minVal = a[i];
                minIdx = i;
            }
        }
        int moves = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) moves--;
        System.out.println(moves);
    }
}
