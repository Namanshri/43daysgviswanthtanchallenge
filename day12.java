import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int comparison = str1.compareTo(str2);

        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
