public class secndArray {
    public static void main(String[] args) {
        //2d dimmensional array
        int sum=0;
        int[][] threeMatrix={ {2,3,4} , {4,5,6} , {7,9,8} };
        for (int i = 0; i <threeMatrix.length ; i++) {
                for (int j = 0; j <threeMatrix[i].length; j++) {
                    // two dimeensional array
                     sum=sum + threeMatrix[i][j];
            }
            System.out.println(sum);
        }
        System.out.println(" ");

    }
}
