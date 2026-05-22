public class Employee {
    private int empId;
    private String name;
    private String department;
    private float basicSalary;
    private float tax;
    private float hra;
    private float da;
    private char gender;
    private int joiningYear;
    public Employee() {
        // Default constructor
    }public Employee(int empId, String name, String department, float basicSalary,
                    float tax, float hra, float da, char gender, int joiningYear) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.tax = tax;
        this.hra = hra;
        this.da = da;
        this.gender = gender;
        this.joiningYear = joiningYear;
    }
    public void displayDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
    }
}