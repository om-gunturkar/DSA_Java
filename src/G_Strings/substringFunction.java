package G_Strings;
//substring - continuous char from a string
//subsequence - any char from a string
public class substringFunction {
    public static String substring(String str,int si,int ei){
        String subStr="";
        for (int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args){
        String str="Hello World";
        System.out.println(substring(str,0,5));
    }


}
