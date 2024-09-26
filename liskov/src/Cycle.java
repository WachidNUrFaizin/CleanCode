public class Cycle extends TransportationDevice {
    int price = 0;

    public void printDetails() {
        System.out.println("Cycle Details:");
        System.out.println("Name: " + getName());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Engine Type: None (Cycle doesn't have an engine)");
        System.out.println("Price: " + price);
    }
}
