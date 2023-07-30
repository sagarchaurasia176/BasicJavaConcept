//You are given an 2D array of integers. Your task is to find the sum of all elements in the array.
public class sumOfallEmentsin2d {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6}};
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);

    }
}