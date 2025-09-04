import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();

        int totalCost = k * w * (w + 1) / 2;
        int borrow = totalCost > n ? totalCost - n : 0;

        System.out.println(borrow);
    }
}
