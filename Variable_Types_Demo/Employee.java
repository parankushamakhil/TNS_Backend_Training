public class Employee {
    // Instance variables
    String name;
    String employeeId;
    String role;
    double montlySalary;
    String department;
    
    // static variable
    static String companyName = "Salesforce";
    
    // Method to display employee information
    public void displayEmployeeInformation() {
        //local variable
        String infoHeader = "Employee Information:";
        //printing employee information
        System.out.println(infoHeader);
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Role: " + role);
        System.out.println("Department: " + department);
        System.out.println("Montly Salary: $" + montlySalary);
    }
}