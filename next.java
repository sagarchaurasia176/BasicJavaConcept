public class next {
    public static void main(String[] args) {
        int k=5;
        for (int i = 1; i <2*k-i ; i++) {
            int stars=(i>k)? 2*k-1 : k;
            for (int j = 1; j <stars; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }   //next pattern
    }
}
