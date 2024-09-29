class Product {
    public int prod(int a, int b, int c) {
        return a * b * c;
    }
    public double prod(double a, double b, double c) {
        return a * b * c;
    }
}
public class Main {
    public static void main(String[] args) {
        Product obj = new Product();
        int prod1 = obj.prod(1, 2, 3);
        System.out.println("Product of three integers: " + prod1);
        double prod2 = obj.prod(1.0, 2.0, 3.0);
        System.out.println("Product of three doubles: " + prod2);
    }
}

