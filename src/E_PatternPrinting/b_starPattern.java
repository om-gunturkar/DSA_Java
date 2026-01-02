package E_PatternPrinting;

public class b_starPattern {
    public static void main() {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
