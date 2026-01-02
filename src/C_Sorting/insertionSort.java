package C_Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
/*
Output -
Sorted array:
5
6
11
12
13
 */
