public class HollowRectanglePattern {
    public static void main(String[] args) {
        // hollwo reactangel
        // let us considerd you have to firstly check the rows and columns value
        // after you have to take to two integer
        // for example
        for(int i=1;i<=5;i++)
        {
            for (int j=1; j<=6;j++){
                if(i==1 || i==5 || j==1 || j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
