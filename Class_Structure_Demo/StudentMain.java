public class StudentMain {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student();
        Student student2 = new Student();
        
        // values for student1
        student1.name = "Arun";
        student1.age = 20;
        student1.rollNumber = 101;
        student1.year = 4;
        student1.branch = "CSE";

        // values for student2
        student2.name = "Chaya";
        student2.age = 19;
        student2.rollNumber = 102;
        student2.year = 4;
        student2.branch = "ECE";

        // Displaying information for both students
        System.out.println("First Student Information:");
        student1.displayInfo();
        
        System.out.println("\nSecond Student Information:");
        student2.displayInfo();
    }
}