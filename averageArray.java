public class averageArray {
    public static void main(String[] args) {
        int sum=0;
        int[] numberAvg={1,2,3,4,5};
        for (int i =0; i <numberAvg.length; i++) {
             sum+=numberAvg[i];
        }//apply condition;
        System.out.println("total " + sum);
        //avg
        float totalNum=sum/5;
        System.out.println("avg is " + totalNum);
    }
}
