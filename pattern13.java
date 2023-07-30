public class pattern13 {
    public static void main(String[] args) {
        int num=6;
        int number=1;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(number);
                // here i am using the incerement variable
                number++;
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
