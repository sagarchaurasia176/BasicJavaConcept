public class sumOfDIagonal {
    public static void main(String[] args) {
        int[][] diagonal={{1,2,3},{4,5,6}};
        int sum=0;
        for (int i = 0; i <diagonal.length ; i++) {
            sum+=diagonal[i][i];
        }
        System.out.println(sum);
    }
}
