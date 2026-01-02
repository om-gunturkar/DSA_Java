package Assignments.Nov_22_2025;

public class b_posNegZeroNumbers {
    public static void main(String[] args) {
        int arr[]={-4,-2,56,33,0,0,4,5,-8,0};
        int positive=0,negative=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            } else if (arr[i]<0) {

                negative++;
            }else if(arr[i]==0) {
                zero++;
            }else{
                System.out.println("Not Found");
            }
        }
        System.out.println("Total Positive Numbers : "+positive);
        System.out.println("Total Negative Numbers : "+negative);
        System.out.println("Total Zero's : "+zero);
    }
}
/*
Output -
Total Positive Numbers : 4
Total Negative Numbers : 3
Total Zero's : 3
 */