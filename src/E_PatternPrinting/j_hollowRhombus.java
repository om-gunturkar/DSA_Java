package E_PatternPrinting;

public class j_hollowRhombus {

    public static void printRhombus(int n,int totalRows,int totalCols){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if (i==1||j==1||i==totalRows||j==totalCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main() {
    printRhombus(5,5,5);
    }

}
