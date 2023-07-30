public class loops {
    public static void main(String[] args) {
     //for loop
        for(int i=0;i<=5;i++){
            System.out.println("sagar");
        }// table of 2
        for(int i=1;i<=10;i*=2){
            System.out.println(i);}// break key with conditional statements
        for(int i = 1; i<50; i*=4){if(i==10){System.out.println(i);break;
            }
        }

        //for loop with break
        for(int i=1;i<=5;i*=3){
            if(i%4==0) {
                System.out.println(i);
                break;
            }
                else{
                    System.out.println("continue keyword");
             continue;
                }
            }
        }

    }
