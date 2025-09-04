import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int maxConsecutive = 1;
        int currentCount = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;
                if (currentCount >= 7) {
                    System.out.println("YES");
                    return;
                }
            } else {
                currentCount = 1;
            }
        }

        System.out.println("NO");
    }
}
