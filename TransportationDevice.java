public class TransportationDevice {
    private String name;
    private double speed;
    private String engineType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

class Car extends TransportationDevice {
    public int price = 600000;

    @Override
    public void setEngineType(String engineType) {
        super.setEngineType(engineType);
        // Operasi berdasarkan tipe mesin
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
        System.out.println("Engine Type: " + getEngineType());
        System.out.println("Price: " + price);
    }
}

class Cycle extends TransportationDevice {
    int price = 0;

    @Override
    public void setEngineType(String engineType) {
        // Tidak ada operasi karena sepeda tidak memiliki mesin
    }

    public void printDetails() {
        System.out.println("Cycle Details:");
        System.out.println("Name: " + getName());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Engine Type: None (Cycle doesn't have an engine)");
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Car
        Car car = new Car();
        car.setName("Sedan");
        car.setSpeed(150);
        car.setEngineType("Petrol");
        car.printDetails();

        System.out.println();

        // Membuat objek Cycle
        Cycle cycle = new Cycle();
        cycle.setName("Mountain Bike");
        cycle.setSpeed(25);
        cycle.setEngineType("None");
        cycle.printDetails();
    }
}
