package basic;
import java.util.Scanner;

public class gradingsystem {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the numeric score (0-100): ");
        int score = obj.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

        obj.close();
    }
}
