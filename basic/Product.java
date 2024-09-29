package basic;
import java.util.Scanner;
class Product {
    private int id;
    private String name;
    private float price;

    // Method to input data
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter product name: ");
        name = scanner.nextLine();
        System.out.print("Enter product price: ");
        price = scanner.nextFloat();
        scanner.close();
    }

    // Method to display data
    public void showData() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.getData();
        System.out.println("\nProduct Details:");
        product.showData();
    }
}
