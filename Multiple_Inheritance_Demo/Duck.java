// duck class

public class Duck implements Flyable, Swimmable{

    String name;
    public Duck(String name) {
        this.name = name;
    }
    // implement fly method
    public void fly(){
        System.out.println(name + " is flying.");
    }
    // implement swim method
    public void swim(){
        System.out.println(name + " is swimming.");
    }

}
