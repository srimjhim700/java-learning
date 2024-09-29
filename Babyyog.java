public class Babyyog{
    void eat(){System.out.println("eating  ");}
    public static void main(String[] args){
        Babyyog a1,a2,a3;
        a1=new Babyyog();
        a2=new dog();
        a3=new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
    
}
class dog extends Babyyog{
    void eat(){System.out.println("eating  ");}
}
class BabyDog extends dog{
    void eat(){System.out.println("drinking milk  ");}
    
}
