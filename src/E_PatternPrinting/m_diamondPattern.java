package E_PatternPrinting;

public class m_diamondPattern {


    public static void printP(int n){
        //1st half
        for (int i=1;i<=n;i++){
            //spaces
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
            //stars
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            //spaces
            System.out.println();
        }
        //2nd half
        for (int i=n;i>=1;i--){

                //spaces
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //stars
                for (int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                //spaces
                System.out.println();

        }
    }
    public static void main() {
        printP(5);
    }
}
