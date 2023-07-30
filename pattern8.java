import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
            System.out.print("enter number");
        int num=n.nextInt();

        for (int i = 1; i <=2*num; i++) {
            // apply the logic
            int total= i >= num? 2* num-i:i;
            for (int j = 1; j <=total; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }
    }