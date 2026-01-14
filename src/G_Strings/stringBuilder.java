
package G_Strings;
import java.util.*;
//same as string,but we can change this , this is not string so we can convert this in String using toString()
public class stringBuilder {

    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("");
        for (char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }

}
