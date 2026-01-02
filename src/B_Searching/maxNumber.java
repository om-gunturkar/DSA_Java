package B_Searching;

public class maxNumber {
    public static void main(String[] args) {
        int []arr={3,6,87,44,76};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Value From Array : "+  max);
    }
}
/*
--Output--
Largest Value Form Array : 87
*/
