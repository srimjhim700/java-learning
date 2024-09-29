public class overloading {
    void run() {
        System.out.println("runnning..");
    }
}
class splender extends overloading {
    void run() {
        System.out.println("run..");
    }
    public static void main(String[] args) {
        overloading o = new splender();// upcasting
        o.run(); //will return method of child class
    }
}
