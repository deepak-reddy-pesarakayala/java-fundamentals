package listassignment;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImplementation {

    private List<Product> productList;

    public ProductServiceImplementation() {
        productList = new ArrayList<>();
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void findAllProduct() {

        if(productList.isEmpty()) {
            System.out.println("No Products Available");
            return;
        }

        for(Product product : productList) {
            product.display();
        }
    }
}