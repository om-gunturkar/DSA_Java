package Assignments.Nov_22_2025;

public class g_vowelsCount {
    public static void main(String[] args) {
        char arr[]={'a','b','e', 'x', 'o', 'u'};
        int count=0;
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {

                count++;
            }
        }
            System.out.println("Total number of vowels: " + count);
        }
}
/*
Output -
Total number of vowels: 4
 */