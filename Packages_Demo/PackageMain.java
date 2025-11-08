import com.avniet.tns.packagedemo.*;
public class PackageMain {
    public static void main(String[] args) {
    PackageDemo student = new PackageDemo("Akhil", 101, "Computer Science", "akhil123@gmail.com");
    System.out.println("Student Name: " + student.studentName); // Public access
    // System.out.println("Student ID: " + student.studentId); // Private access -- Not accessible
    // System.out.println("Student Course: " + student.studentCourse); // Protected access
    // System.out.println("Student Email: " + student.studentEmail); // Default access
    System.out.println("Student ID (via method): " + student.getStudentId()); // Accessing private variable via public methods
    }
}
