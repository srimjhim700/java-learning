package basic;

public class maxofThree {
    public static void main(String[] args){
        int a=10,b=33,c=4,max;
        // Ternary operator
        max=(a>b)? (a>c ? a: c):(b>c ?b:c);
        System.err.println(max);
    }
    
}
