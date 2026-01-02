package B_Searching;

public class pairs {

    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){ // pairs will be like 2, 4, ...
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){ //pairs will be like 2,4 . 2,6 . 2,8 etcc..
                System.out.print("("+current+","+numbers[j]+")");
            }
            System.out.println();
        }
    }

    public static void main() {
    int numbers[]={2,4,6,8,10};
    printPairs(numbers);

    }
}
