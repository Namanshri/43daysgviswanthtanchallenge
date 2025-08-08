import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        boolean[] seen = new boolean[26];
        int distinctCount = 0;

        for (char ch : username.toCharArray()) {
            int index = ch - 'a';
            if (!seen[index]) {
                seen[index] = true;
                distinctCount++;
            }
        }

        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

