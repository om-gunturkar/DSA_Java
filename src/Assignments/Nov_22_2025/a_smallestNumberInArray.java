// Find the smallest number in an array
package Assignments.Nov_22_2025;

public class a_smallestNumberInArray {
    public static void main(String[] args) {
        int []arr={3,6,87,44,76};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Value From Array : "+  min);
    }
}
//Output - Minimum Value From Array : 3