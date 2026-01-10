package F_QuestionArrays;

public class diagonalSum {


    public static int printDiagonal(int matrix[][]){
        int sum=0;
        /*
        //Brute Force Approach O(n^2)
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (i==j){
                    sum+=matrix[i][j];
                }
                else if (i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }

            }
        }
         */
//Optimal Solution O(n)

        for (int i=0;i<matrix.length;i++) {
            //pd
            sum += matrix[i][i];
            //sd
            if (i != matrix.length - 1 - i) { //if i != j then ->
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }


    //Optimal Solution


    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printDiagonal(matrix));

    }
}
