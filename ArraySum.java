public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int[] sumOfArray={2,4,6};
        // for loop
        for (int i = 0; i <sumOfArray.length; i++) {
        sum += sumOfArray[i];
        }
        System.out.println("total sum is" + sum);
    }
}