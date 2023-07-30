public class Pattern9 {
    public static void main(String[] args) {
        // print the loop
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
