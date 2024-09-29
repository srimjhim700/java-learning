package inheritence.hierarchical;

class mymain {
 
    public static void main(String[] args){
        cat c=new cat();
        Dog d=new Dog();
        c.meow();
        d.bark();
    }   
}
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class cat extends Animal{
    void meow(){System.out.println("meowing...");}
}

