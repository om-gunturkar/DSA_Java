package E_PatternPrinting;

public class g_invertedAndRotatedHalfPyramid {
    public static void printPattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");//spaces
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");//stars
            }
            System.out.println();
        }
    }
    public static void main() {
        printPattern(4);

    }
}
