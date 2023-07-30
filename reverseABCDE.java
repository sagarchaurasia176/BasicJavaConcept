public class reverseABCDE {
    public static void main(String[] args) {
     int n=5;
        for (int i = 5; i >=0 ; i--) {
            for (char j = 'A'; j<='A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
