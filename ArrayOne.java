public class ArrayOne {
    public static void main(String[] args) {
        // these are some datatype where we
        // gonna used inside the array likes
        /*
    int [] firstArray;
    char [] chrArray;
    float [] floArray;
    boolean [] boolArray;
    string [] strArray;
     */
        int[] firstArray= {20,30,50,60};
        System.out.println(firstArray[2]);
        firstArray[2]=55;
        System.out.println(firstArray[2]);
        //length
        System.out.println(firstArray.length);

        //for loop to check lenght
        for (int i = 0; i <firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
    }
}
