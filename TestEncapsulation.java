import java.util.Scanner;
class  Student{
    private long roll_no;
    private String name,email;
    private double[] marks = new double[3]; //3 subjects
    public long getRollno(){
        return roll_no;
    }
    public void setRoll(long roll_no){
        this.roll_no=roll_no; //set method
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setMarks(double[] marks){
        if (marks.length != 3) {
            System.out.println("Error: Expected 3 subject marks.");
            return;
        }
        this.marks = marks;
    }
    public double[] getMarks() {
        return marks;
    }
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}
public class TestEncapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setRoll(2213525);
        s.setEmail("srimjhim678@gmail.com");
        s.setName("Rimjhim Singh");
        System.out.println("roll no: "+s.getRollno());
        System.out.println("email: "+s.getEmail());
        System.out.println("Name "+s.getName());
        double[] subjectMarks = new double[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("\n Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
            scanner.close();
        }
        s.setMarks(subjectMarks);
        System.out.print("Average: "+s.calculateAverage());
    }
    
}
