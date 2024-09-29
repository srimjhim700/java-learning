
package inheritence.multilevel;

 class Animal {
    void eat() {
        System.out.println("eating..");
    }

}

class Dog extends Animal {
    int sum = 110;

    void bark() {
        System.out.println("barking..");
    }
}

class babydog extends Dog {
    void weep() {
        System.out.println("weeping..");

    }
}

class testinheritence {
    public static void main(String[] args) {
        babydog d = new babydog();
        d.weep();
        d.bark();
        d.eat();
        System.out.println("calling the dog class" + d.sum);
    }
}