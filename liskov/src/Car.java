public class Car extends TransportationDevice implements EnginePoweredDevice {
    public int price = 600000;
    private String engineType;

    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;

        if (engineType.equalsIgnoreCase("Petrol")) {
            this.price += 50000;
        } else {
            this.price += 100000;
        }
    }

    public void printDetails() {
        System.out.println("Car Details:");
        System.out.println("Name: " + getName());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Engine Type: " + engineType);
        System.out.println("Price: " + price);
    }
}
