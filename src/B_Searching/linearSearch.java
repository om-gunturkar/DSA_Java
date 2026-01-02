package B_Searching;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]= {10,20,35,50,80,90};

        int target = 90;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Found at index : "+i);
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Not Found");
        }
    }
}

//Output - Found at index : 5
