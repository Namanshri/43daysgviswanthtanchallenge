import java.io.*;
import java.util.*;

public class day38 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] points = new int[n];
        for (int i = 0; i < n; i++) points[i] = Integer.parseInt(st.nextToken());

        int best = points[0], worst = points[0], amazing = 0;
        for (int i = 1; i < n; i++) {
            if (points[i] > best) {
                amazing++;
                best = points[i];
            } else if (points[i] < worst) {
                amazing++;
                worst = points[i];
            }
        }
        System.out.println(amazing);
    }
}
