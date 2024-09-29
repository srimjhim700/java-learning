package inheritence.avoidmultipleInheritence;
interface one{
    public void print_geek();
}
interface two{
    public void print_for();
}
interface Three extends one,two{
    public void print_geek();
}
class Child implements Three{
    @Override
    public void print_geek(){
        System.out.println("geek...");
    }
    public void print_for(){
    System.out.println("for...");
}
}
public class Main {
    public static void main(String[]  args){
        Child c=new Child();
        c.print_for();
        c.print_geek();
    }
    
}
