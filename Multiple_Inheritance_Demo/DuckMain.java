//main class

public class DuckMain {
public static void main(String[] args) {
        Duck Broke = new Duck("Broke");

        // call methods from both interfaces
        Broke.takeOff();
        Broke.fly();
        Broke.swim();
        Broke.dive();

    }
}