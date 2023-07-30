import java.util.Scanner;
public class Fabionaciesseries {
    public static void main(String[] args) {
        int a=0,b=1,c;
        int series;
        Scanner number=new Scanner(System.in);
        System.out.print("Enter number");
        //another var
        series=number.nextInt();// fabionacies series..
        for (int i=1; i<=series; i++){
            System.out.print(b+" ");
            c = a + b;
            a=b;
            b=c;
        }
    }
}
