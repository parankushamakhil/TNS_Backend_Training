public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Car car = new Car("Audi", "Sedan", 2023, 4, "Deisel");
        Bike bike = new Bike("Kawasaki", "Ninja", 2023, 6, "998cc");


        // Demonstrate inheritance and method overriding
        System.out.println("=== Car Information ===");
        car.displayInfo();
        car.start();
        car.drift();
        car.stop();

        System.out.println("\n=== Motorcycle Information ===");
        bike.displayInfo();
        bike.start();
        bike.wheelie();
        bike.stop();
    }
}