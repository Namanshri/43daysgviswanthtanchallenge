import java.util.*;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        
        for (int sec = 0; sec < t; sec++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                   
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i++; 
                }
            }
        }
        
        System.out.println(new String(arr));
        sc.close();
    }
}
