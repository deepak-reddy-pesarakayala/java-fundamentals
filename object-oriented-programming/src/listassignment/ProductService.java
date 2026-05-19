package listassignment;

import java.util.ArrayList;

 public class ProductService {

    ArrayList<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public void findAllProduct() {

        if(productList.size() == 0) {
            System.out.println("No Products Found");
        }
        else {

            for(Product product : productList) {
                product.display();
            }
        }
    }
}