import java.util.ArrayList;

public class Employee {
    // Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs" + salary);
    }

    // Main method inside the same file
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Ajay", 50000);
        Employee emp2 = new Employee(102, "Asmita", 60000);
        Employee emp3 = new Employee(103, "Shivraj", 55000);

        // Storing employees in an ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Displaying all employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
