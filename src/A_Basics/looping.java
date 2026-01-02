package A_Basics;

public class looping {
    public static void main(String[] args) {
        int []arr = {2,1,44,7,2};
        System.out.println(arr[2]);
        arr[2]=90;
        System.out.println(arr[2]);
        System.out.println("Using Loop");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/*
-- OUTPUT --
44
90
Using Loop
2
1
90
7
2
*/
