import java.util.Scanner;

public class DivideSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,b=0;
        try {
            System.out.println("enter two integer ");
            a=sc.nextInt();
            b=sc.nextInt();
            int c=a/b;
            System.out.println("division is "+c);
            sc.close();
        }catch (ArithmeticException ex){
            System.out.println(" Exception occured "+ ex.getMessage());
        }
        int d=a+b;
        System.out.println("sum is "+ d);    
    }
   
}
