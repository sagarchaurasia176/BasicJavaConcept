public class factorial {
    public static void main(String[] args) {
    int num=7;
    int factorials=1;
    for (int i=1; i<=num; i++){
        factorials=factorials*i;
    }
        System.out.print("number is" + factorials);
    }
}
