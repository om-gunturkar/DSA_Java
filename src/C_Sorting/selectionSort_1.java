package C_Sorting;

public class selectionSort_1 {


    public static void printSelection(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,5,1};
        printSelection(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


}