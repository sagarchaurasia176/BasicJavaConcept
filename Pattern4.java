public class Pattern4 {
    public static void main(String[] args) {
        int num=5;
        for(int i = 1; i <=5 ; i++) {
            //creates the space
            for(int j = 1; j<=num-i; j++) {
                System.out.print("");
            }
            // loop
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
