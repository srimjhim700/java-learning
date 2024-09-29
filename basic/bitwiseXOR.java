package basic;
public class bitwiseXOR {
    public static void main(String[] args){
        //swap two numbers using bitwise operator
        int a=10;
        int b=13;
        a=a^b; 
        b=a^b;
        a=a^b;

        System.err.println("swapped numbers are : " +a +" and "+b);
    }
    
}
