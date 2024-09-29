package basic;
import java.util.Scanner;

public class Candidate {
    private int RNO;
    private String name,Remarks;
    private float Score;

    public void AssignRem(){
        if (Score>=50){
            Remarks="Selected ";
        }
        else
            Remarks="Not selected ";
    } 
    public void ENTER(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the roll no :");
        RNO=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name :");
        name=sc.nextLine();
        System.out.print("Enter the score :");
        Score=sc.nextInt();
        AssignRem();
        sc.close();
    }
    public void Display(){
        System.out.println(" Roll no "+RNO);
        System.out.println(" Name "+name);
        System.out.println(" score :"+Score);
        System.out.println(" Remarks :"+Remarks);
    }
    public static void main(String[] args){
        Candidate can=new Candidate();
        can.ENTER();
        System.out.println("the Details are : ");
        can.Display();

       
    }
    
}
