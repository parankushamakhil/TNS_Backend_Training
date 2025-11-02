public class Student {
    // variables
    String name, branch;
    int age, rollNumber, year;

 
    // Method to display student information
    public void displayInfo() {
        System.out.print("Student Name: " + name);
        System.out.print("\tAge: " + age);
        System.out.print("\tRollNumber: " + rollNumber);
        System.out.print("\tYear: " + year);
        System.out.print("\tBranch: " + branch);
    }
}