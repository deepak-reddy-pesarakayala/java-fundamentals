package listassignment;

public class ProductUI {

    public static void main(String[] args) {

        ProductService service =new ProductService();

        Product p1 = new Product(1, "Shoe", "Footwear", 500);
        Product p2 = new Product(2, "Watch", "Accessories", 1500);
        Product p3 = new Product(3, "Bag", "Travel", 1200);

        service.add(p1);
        service.add(p2);
        service.add(p3);

        System.out.println("Product Details");

        service.findAllProduct();

        System.out.println("Execution Finished");
    }
}