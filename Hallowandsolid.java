public class Hallowandsolid {
    public static void main(String[] args) {
        //Hallow and solid  questions
        //creates the hallows
        for(int i=1; i <= 4;i++){
            for (int j=1; j <= 3; j++){
                if(i==1 || i==4 || j==1 || j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // solid pattern
    }
}
