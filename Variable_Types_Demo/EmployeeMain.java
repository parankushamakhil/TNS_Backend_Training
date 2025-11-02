public class EmployeeMain {
    public static void main(String[] args) {
        // Create an instance of Employee class
        Employee employee = new Employee();
        
        // Set employee details
        employee.name = "John";
        employee.employeeId = "E123";
        employee.role = "Software Engineer";
        employee.department = "Development";
        employee.montlySalary = 85000.00;

        
        // Print employee details
        employee.displayEmployeeInformation();
    }
}