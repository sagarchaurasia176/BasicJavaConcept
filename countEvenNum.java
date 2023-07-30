public class countEvenNum {
    public static void main(String[] args) {
        int[] evenNum={1,2,3,4};
        // even num
        for (int evennumber:evenNum){
        if(evennumber %2 == 0){
            System.out.println("even num is" + " " + evennumber);
            break;
        }

        }

    }
}
