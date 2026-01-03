package E_PatternPrinting;

public class h_invertedHalfPyramid_Numbers {
    public static void printPatterns(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

    public static void main() {
        printPatterns(5);

    }
}
