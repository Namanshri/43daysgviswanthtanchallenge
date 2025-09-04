import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] percentages = new int[n];
        for (int i = 0; i < n; i++) {
            percentages[i] = scanner.nextInt();
        }
        scanner.close();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += percentages[i];
        }

        double average = sum / n;
        System.out.println(average);
    }
}
