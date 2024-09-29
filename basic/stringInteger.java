package basic;

public class stringInteger {
    public static void main(String[] args){
        String s="300";
        int n=Integer.parseInt(s);
        System.out.println(" converted string to integer "+n);
        System.out.print( ((Object)n).getClass().getSimpleName());
    
    }
    
}
