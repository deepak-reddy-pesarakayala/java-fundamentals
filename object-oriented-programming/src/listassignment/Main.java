package listassignment;

public class Main {
    public static void main(String[] args) {
        ProductService service =new ProductService();
        service.add(new Product(1, "shoe", "shoe", 500));
        service.findAllProduct();
        System.out.println("Execution  finished.");
    }
}