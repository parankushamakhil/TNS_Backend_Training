//swimmable interface

public interface Swimmable {
    void swim();

    // default method 
    default void dive() {
        System.out.println("Diving...");
    }
}
