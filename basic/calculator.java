package basic;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){

        //calculator with all results:------------------
        // Scanner o=new Scanner(System.in);
        // System.out.print("enter the number 1 :");
        // int a=o.nextInt();  
        // System.out.print("enter the number 2 :");
        // int b=o.nextInt();
        // int c=a%b;
        // int d=a+b;
        // int e=a-b;
        // int f=a*b;
        // System.out.println("the Remainder is "+c);
        // System.out.println("the Addition is "+d);
        // if(a>b){
        //     System.out.println("the Subtracton  is "+e);
        // }
        // else
        // {
        //     System.out.println("Result is negative for subtraction"+e);
        // }
        // System.out.println("the multiplication is "+f);
        // o.close();


        // calculator with one result using switch case------------------
        Scanner o=new Scanner(System.in);
        System.out.print("enter number 1 ");
        int a=o.nextInt(); 
        System.out.print("enter number 2 ");
        int b=o.nextInt(); 
        System.out.println("choose the operation (+,-,*,/): ");
        char operation=o.next().charAt(0);
        int result=0;
        boolean validOperation=true;

        switch (operation) {
            case '*':
                result=a*b;
                break;
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break; 
            case '/':
            if (b != 0) {
                result = a /b;
            } else {
                System.out.println("Error: Division by zero!");
                validOperation=false;
            }
            break;
        
            default:
            System.out.println("Error : Invalid Operation ");
            validOperation =false;
            break;
        }
        if(validOperation){
            System.out.println("result is : "+result);
        }
        o.close();
    }

    
}
