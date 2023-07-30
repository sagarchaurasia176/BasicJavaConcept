import jdk.dynalink.beans.StaticClass;

public class pattern18 {
    public static void main(String[] args) {
        // row column pattern
        int row = 5;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // next pattern
        int n=5;
        for (int i = 5; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        // next pattern
        int a=5;
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    // next pattern
    int b=5;
        for (int i =b; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // next pattern
        int c=5;
        //outer column
        for (int i = 1; i <=c ; i++) {
            // inner column
            for (int j = 1; j <=c-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }



    }
}