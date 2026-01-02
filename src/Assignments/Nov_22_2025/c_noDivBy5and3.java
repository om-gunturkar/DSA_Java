package Assignments.Nov_22_2025;

public class c_noDivBy5and3 {
    public static void main(String[] args) {
        int arr[]= {3,5,9,20,15,45,30,7,4};

        int count_3=0,count_5=0,countBoth=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                countBoth++;
            }else if(arr[i]%3==0){
                count_3++;
            }else if(arr[i]%5==0){
                count_5++;
            }else{
                System.out.println("Not divisible by 3 and 5 : "+arr[i]);
            }
        }
        System.out.println("Divisible by 3 and 5 : "+countBoth);
        System.out.println("Divisible by 3 : "+count_3);
        System.out.println("Divisible by 5 : "+count_5);
    }
}

/*
Not divisible by 3 and 5 : 7
Not divisible by 3 and 5 : 4
Divisible by 3 and 5 : 3
Divisible by 3 : 2
Divisible by 5 : 2

*/