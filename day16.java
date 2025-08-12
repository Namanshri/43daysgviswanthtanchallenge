import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oneRow = -1, oneCol = -1;

     
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    oneRow = i + 1; 
                    oneCol = j + 1;
                }
            }
        }

   
        int moves = Math.abs(oneRow - 3) + Math.abs(oneCol - 3);


        System.out.println(moves);

        sc.close();
    }
}
