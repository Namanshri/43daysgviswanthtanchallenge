import java.util.Scanner;

public class day8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline after integer input

        int i = 0;
        while (i < n) {
            String word = scanner.nextLine();
            
            if (word.length() > 10) {
                int count = word.length() - 2;
                String abbreviation = word.charAt(0) + String.valueOf(count) + word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            } else {
                System.out.println(word);
            }
            
            i++; // increment counter
        }
        scanner.close();
    }
}
