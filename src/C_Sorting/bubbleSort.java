package C_Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,3,8,4,2};
        System.out.println("Before Sorted Array : ");
        for(int n1:arr){
            System.out.println(n1+ " ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Sorted Array");
        for(int n1:arr){
            System.out.println(n1+ " ");
        }
    }
}
/*
Output -
Before Sorted Array :
5
3
8
4
2
After Sorted Array
2
3
4
5
8
 */
