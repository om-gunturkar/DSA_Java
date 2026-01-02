package Assignments.Nov_22_2025;

public class f_sumAndAverage {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=0;
        double average=0;
        for(int i=0;i<arr.length;i++){

                sum+=arr[i];

        }
        average = sum/arr.length;
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+average);

    }
}
/*
Output -
Sum is : 150
Average is : 30.0
 */