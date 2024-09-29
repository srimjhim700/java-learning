package inheritence.multilevel;

public class Vehicle{
   public void start(){
        System.out.println("Vehicle started");
   }; 
}
class car extends Vehicle{
    public void drive(){
        System.out.println("Car driving");
    };
}
class sportscar extends car{
    @override
    public void drive(){
        System.out.println("Sports Car driving fast");
    }
}
public class Main{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        v.
    }
}

