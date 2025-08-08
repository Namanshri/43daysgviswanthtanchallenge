public import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        if (word.length() > 0) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String result = firstChar + word.substring(1);
            System.out.println(result);
        }
    }
}
 {
    
}
