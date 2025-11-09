//flyaable interface


public interface Flyable {
    void fly();

    // default method 
    default void takeOff() {
        System.out.println("Taking off...");
    }
}
