/*Input the numbers of units consumed by the customer. Calculate the electricity bill.
For the first 100 units charge Rs. 4 per unit
For the next 200 units charge Rs. 5 per unit 
For every additional unit above 300 units charge Rs 10 per unit 
If the amount exceeds Rs. 1000 charge 5% additional surcharge
All the amounts are charged 18% GST
Print the units consumed and the amount to be paid.
Example:
Input:
Units : 310
Output :    
Units : 310
Amount : 1858.5	       	
                       	 
Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 (10 additional units above 300) + 75 (5% surcharge) + 283.5 (GST) = 1858.5 (Total) */

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the total units: ");
            int unit = scanner.nextInt(); 
            
            double charge = 0;

            if (unit <= 100) {
                charge = unit * 4;
            } else if (unit <= 300) {
                charge = 5 * (unit-100) + 100 * 4;   //from 101 to 300
            } else {
                charge = 10 * (unit - 300) + 100 * 4 + 200 * 5;
            }

            if ( charge > 1000) {
                
                double new_charge = ( charge * 5 )/100;
                charge +=new_charge;
            }
            double gst_charge = (charge * 18)/100;
            charge = charge + gst_charge;
           

            System.out.println("The units consumed: " + unit);
            System.out.println("Total amount is " + charge);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

