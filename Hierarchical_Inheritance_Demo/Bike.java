// Child class Motorcycle
public class Bike extends Vehicle {
    private int gears;
    private String engine;

    public Bike(String brand, String model, int year, int gears, String engine) {
        super(brand, model, year);
        this.gears = gears;
        this.engine = engine;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void wheelie() {
        System.out.println("Motorcycle on "+gears+" gears, with engine " + engine + " is doing a wheelie!");
    }

}