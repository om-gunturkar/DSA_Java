package C_Sorting;

public class selectionSort_2 {
    public static void main(String[] args) {


        int []arr = {64,25,12,22,11};

        //  i=1
        for(int i=0 ; i<arr.length-1 ;i++)
        {

            int minIndex=i;
            //minIndex=1
            //find index  of smallest  element in the rmaining array
            //j=5       5<5
            for(int j=i+1 ;j<arr.length;j++)
            {     //
                //     64<12
                //   arr[4]<arr[2]
                if(arr[j] < arr[minIndex])
                {
                    minIndex=j;
                    // minindex=2
                }

            }

            //swapp minimum elemnet with first elemnt
            int temp=arr[minIndex];
            //temp=12
            arr[minIndex]=arr[i];
            //arr[2]=25
            arr[i]=temp;
            //arr[1]=12
        }


        System.out.println("Sorted array ");

        for(int val :  arr)
        {
            System.out.println(val + " ");
        }

    }
}
/*
Sorted array
11
12
22
25
64
 */
