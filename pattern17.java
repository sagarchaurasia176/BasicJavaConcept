public class pattern17 {
    //triangle
    public static void main(String[] args) {
        int n=3;
        int k=5;
        //row
        for (int i = 1; i <=n; i++) {
            //column
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
