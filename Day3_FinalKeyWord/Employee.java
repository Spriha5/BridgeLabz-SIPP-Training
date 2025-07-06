package Day3_FinalKeyWord;

public class Employee {
    static String companyName = "Company abc";
    private static int totalEmployees = 0;
    private String name;
    private String designation;
    private final int ID;

    public Employee(String name, int ID, String designation) {
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + ID);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Spriha", 101, "Software Engineer");
        Employee emp2 = new Employee("Singh", 102, "Data Analyst");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        displayTotalEmployees();
    }
}
