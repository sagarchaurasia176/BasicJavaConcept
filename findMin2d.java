public class findMin2d {
    public static void main(String[] args) {
int[][]mini={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(min(mini));
    }
    static int min(int[][] arrs){
        int minimum = arrs[0][0];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j <arrs[i].length; j++)
            {
            if(arrs[i][j] <minimum){
                minimum=arrs[i][j];
            }
            }
        }
            return minimum;
    }

}