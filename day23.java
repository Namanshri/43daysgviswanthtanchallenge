import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int steps = x / 5;
        if (x % 5 != 0) {
            steps++;
        }

        System.out.println(steps);
    }
}
