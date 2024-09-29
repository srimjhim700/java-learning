package basic;
import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner o=new Scanner(System.in);
       
        System.out.print("enter your name ");
        String name=o.nextLine();
        System.out.println("ola! " +name);
        o.close();
    }
}