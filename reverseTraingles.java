import java.util.Scanner;

public class reverseTraingles {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                //space
                System.out.print("");
            }
            for (int j = 1; j <= 2 * num - (2 * i + 1); j++) {
                //star
                System.out.print(" *");
            }
            for (int j = 1; j <= i; j++) {
                //space
                System.out.print("");
            }
            System.out.println(" ");
        }

    }

}
