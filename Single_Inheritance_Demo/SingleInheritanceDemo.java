
// Main class to demonstrate single inheritance
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();
        
        // Set the name using inherited field
        myDog.name = "Leo";
        
        // Call methods from parent class
        System.out.println("My dog's name is " + myDog.name);
        myDog.eat();
        myDog.sleep();
        
        // Call method from child class
        myDog.bark();
    }
}