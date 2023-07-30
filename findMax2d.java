public class findMax2d {
    public static void main(String[] args) {
        int[][] arr={
                     {1,2,3},{4,5,6},{7,8,9}};
        System.out.print(maxNumber(arr));
    }
    public static int maxNumber(int[][] arrNumber){
        int max=arrNumber[0][0];
        for (int i = 0; i <arrNumber.length ; i++) {
            for (int j = 0; j < arrNumber.length ; j++) {
                if (arrNumber[i][j] > max){
                    max =arrNumber[i][j];
                }
            }
        }
        return max;
    }
}
