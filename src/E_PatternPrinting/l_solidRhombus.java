package E_PatternPrinting;

public class l_solidRhombus {

    public static void printNew(int n){
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main() {
        printNew(5);
    }

}
