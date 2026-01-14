package G_Strings;
import java.util.*;

public class basics {
    public static void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        //here the str!=str2 as both are strings but new keywords creates new String which dont points to the prev one



        Scanner sc=new Scanner(System.in);
        String name;
        //name=sc.next();only prints 1 word
        name=sc.nextLine();//prints entire line
        System.out.println(name);


        String FullName="Tony Stark";
        System.out.println(FullName.length());

        // Concatination
        String FirstName = "Om";
        String LastName = "Gunturkar";

        String FullName1=FirstName+" "+LastName;
        System.out.println(FullName1);
    // print every character

        printLetters(FullName1);
    }
}
