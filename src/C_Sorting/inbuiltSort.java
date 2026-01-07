package C_Sorting;
import java.util.Arrays;
public class inbuiltSort {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,6,3};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
