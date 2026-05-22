import com.java.oop.abstraction.Customer;
import com.java.oop.polymorphism.CustomerService;

import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();

        List<com.java.oop.abstraction.Customer> customers = customerService.getCustomers();

        for (Customer customer : customers) {
            customerService.displayCustomer(customer);
        }
    }
}
