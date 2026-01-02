package Assignments.Nov_22_2025;

public class i_countFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 2, 3, 1, 3};
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // skip already counted elements
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;  // mark as counted
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
/*
Output -
1 -> 2
2 -> 2
3 -> 4
 */