import java.util.HashSet;

public class Stringarr {
    public static void main(String[] args) {
        String s="eat apple$ daily";
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {  
            char ch = s.charAt(i);
            if (Character.isLetter(ch) && !"aeiou".contains(ch + "")) { //to convert character to string we are doing ch + ""
                set.add(ch);
            }      
        }
        System.out.println(set);
       
    }
    
}
