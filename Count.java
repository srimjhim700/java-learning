import java.util.*;
public class Count {
    public static void main(String[] args) {
        String s="111110011111111000110";  
        String[] a=s.split("0+");  //regular expression one or more zeros.
        int longest=a[0].length();
        for (int i=1;i<a.length;++i){
            if(a[i].length()>longest){
                longest =a[i].length();
            }
        }
        System.out.println("longest streak "+ longest);

    }
    
}
