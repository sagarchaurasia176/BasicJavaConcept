public class Pattern1 {
    public static void main(String[] args) {
     int num=4;
     // outside loop is your row
        for (int i = 1; i <= num; i++) {
 // insider loop is column
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
