public class pattern5 {
    public static void main(String[] args) {
        int n=4;
        for(int i = 1; i <=n; i++) {
            // logic here is that
            int number = i >=n ? 2 * n-i :i;
            for(int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
