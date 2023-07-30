public class Pattern {
    public static void main(String[] args) {
        // pattern for understanding better for loop
        // outer loop is your - rows;
        // inner loop is your - column;

        // lets start to make the star

        //row
        for(int i=1; i<3; i++) {
            for (int j = 1; j<=4; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}