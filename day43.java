import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        sc.close();

        if (isAllUpper(word) || (isAllUpper(word.substring(1)) && Character.isLowerCase(word.charAt(0)))) {
            System.out.println(swapCase(word));
        } else {
            System.out.println(word);
        }
    }

    private static boolean isAllUpper(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static String swapCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
