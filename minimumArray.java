public class minimumArray {
    public static void main(String[] args) {
        //min num in array
        int[] minArray={1,5,3,6,5};
        for (int min: minArray)
        {
            if(min<=minArray.length){
                System.out.println("min value is" + " " +min);
                break;
            }
        }

    }

}