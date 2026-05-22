public class Main {

    public static void main(String[] args) {

        System.out.println("--- Working with Primitive Data Types ---");
        byte age = 100; 
        System.out.println("Age value stored directly: " + age);

        System.out.println("\n-----------------------------------------");
        System.out.println("--- Instantiating Employee Objects ---");

        // Declaring references and mapping distinct heap addresses
        Employee emp = new Employee(); 
        Employee emp1 = new Employee();    

        System.out.println("Employee memory allocations active!");
    }
}