import java.util.Scanner;
public class palidrome {
    public static void main(String[] args) {
        // wap to reverse the number and check that the
        // given num should be equal to its op
        //formula of reverse is [ Rev * 10 + digit ]
        Scanner n = new Scanner(System.in);
        int obj = n.nextInt();
        int rev = 0;
        while (obj > 0) {
            int digit = obj % 10;
            rev = rev * 10 + digit;
            System.out.println(rev);
            obj /= 10;
        }
        System.out.println(" ");

        // check if the num is palidrom
    int obj1=n.nextInt();
    if(obj1==0){
        System.out.println("num is pail");
    }
    else{
        System.out.print("num is'nt pail");
    }

    }
    }
