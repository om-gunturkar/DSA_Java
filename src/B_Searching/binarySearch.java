package B_Searching;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]= {10,20,35,50,80,90};
        int target = 20;
        int low = 0, high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                System.out.println("Found At Index : "+mid);
                return;
            } else if (target<arr[mid]) {
                high = mid - 1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("Not Found");
    }
}
//Output - Found At Index : 1
