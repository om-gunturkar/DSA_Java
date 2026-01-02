package A_Basics;

public class oddEvenNumber {
    public static void main(String[] args) {
        int []arr={2,5,3,67,55,87,22,45,66,76};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is an Even Number.");
                even++;
            }else{
                System.out.println(arr[i]+" is an Odd Number.");
                odd++;
            }
        }
        System.out.println("total even number :"+ even);
        System.out.println("total odd number :"+ odd);

    }
}
/*
--Output--
2 is an Even Number.
5 is an Odd Number.
3 is an Odd Number.
67 is an Odd Number.
55 is an Odd Number.
87 is an Odd Number.
22 is an Even Number.
45 is an Odd Number.
66 is an Even Number.
76 is an Even Number.
total even number :4
total odd number :6

*/
