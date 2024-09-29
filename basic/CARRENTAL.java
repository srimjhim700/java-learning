package basic;
import java.util.Scanner;

public class CARRENTAL {
    private int carid;
    private String carType;
    private float rent;
    public void getCar(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Car ID: " );
        carid=sc.nextInt();
        sc.nextLine();
        System.out.println(" choose car type between small car/SUV :" );
        carType=sc.nextLine();
        sc.close();
            
    }
    public void carRent(){
        switch (carType) {
            case "small car":
                rent = 1000;
                break;
            case "SUV":
                rent = 1500;
                break;
            default:
                System.out.println("Invalid car type entered.");
                break;
        }

    }
    public void ShowCar(){
        System.out.println(" Car ID: " + carid);
        System.out.println(" Car Name: " + carType);
        System.out.println(" Rent: $" + rent);
    }

    public static void main(String[] args){
        CARRENTAL student= new CARRENTAL();
        student.getCar();
        student.carRent();
        System.out.println("Car Details: ");
        student.ShowCar();

    }
    
}
