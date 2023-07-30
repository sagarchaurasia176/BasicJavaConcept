public class swapTwo {
    public static void main(String[] args) {
        String str1="sagar";
        String str2="info";
        //let it be converted
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        // after swap
        str1=str1.substring(str2.length());
        System.out.printf(str1+str2);


    }
}
