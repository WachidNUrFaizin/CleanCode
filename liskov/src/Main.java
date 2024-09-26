public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Sedan");
        car.setSpeed(150);
        car.setEngineType("Petrol");
        car.printDetails();

        System.out.println();


        Cycle cycle = new Cycle();
        cycle.setName("Mountain Bike");
        cycle.setSpeed(25);
        cycle.printDetails();
    }
}
