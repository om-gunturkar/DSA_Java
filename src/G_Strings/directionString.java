//Given a route containing 4 dir (E,W,N,S), find shortest path to reach destination

package G_Strings;
import java.util.*;


public class directionString {

        public static float getShortest(String path){
            int x=0,y=0;
            for(int i=0;i<path.length();i++){
                char dir=path.charAt(i);
                //South
                if(dir=='S'){
                    y--;
                } else if (dir=='N') {
                    y++;
                }else if(dir=='W'){
                    x--;
                }else {
                    x++;
                }
            }
            int X2=x*x;
            int Y2=y*y;
            return (float)(Math.sqrt(X2+Y2));
        }
public static void main(String[] args){

String path="WNEENESENNN";
    System.out.println(getShortest(path));

}

}
