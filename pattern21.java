import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
       // pattern
        Scanner num=new Scanner(System.in);
        int num1= num.nextInt();
        for (int i = 1; i <=2*num1-1 ; i++) {
            //stars
            int star=(i>num1)? 2*num1-i:i;
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
