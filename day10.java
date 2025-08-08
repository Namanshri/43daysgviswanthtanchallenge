import java.util.Scanner;

public class day10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of participants n and k-th position
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] scores = new int[n];

        // Input: Scores in non-increasing order
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int threshold = scores[k - 1]; // Score of the k-th place finisher

        int count = 0;
        // Count participants who have score ≥ threshold and score > 0
        for (int i = 0; i < n; i++) {
            if (scores[i] >= threshold && scores[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
