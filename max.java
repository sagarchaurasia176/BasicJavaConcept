import java.util.Arrays;
public class max {
    public static void main(String[] args) {
        int[] arrayName = {1, 2,8,20, 6, 3};
        // find max or min  number
        for (int max:arrayName){
            if(max>=arrayName.length) {
                System.out.print("max is " + " " + max + " ");
            }
            else if (max<=arrayName.length)
            {
                System.out.print("min is" + " " + max +" ");
            }
            else{
                System.out.println("error");
            }

        }
    }
}