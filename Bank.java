//polymorphism-------------------------------------
public class Bank {
    float getRateOfinterest(float f){
        System.out.println("class parent ");
        return f;
    }
    public static void main(String[] args) {
        Bank b;
        b=new Bank();
        System.out.println(b.getRateOfinterest(9f));
        b  = new SBI();
        System.out.println(b.getRateOfinterest(5.7f)); 
        b=new ICICI();
        System.out.println(b.getRateOfinterest(6.7f)); 
        b=new AXIS();
        System.out.println(b.getRateOfinterest(7.7f)); 
    }
}
class SBI extends Bank{
    float getRateOfinterest(float s){
        return s;
    }
}
class ICICI extends Bank{
    float getRateOfinterest(float i){
        return i;
    }
}
class AXIS extends Bank{
    float getRateOfinterest(float a){
        return a;
    }    
}

