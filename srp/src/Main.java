public class Main {
    public static void main(String[] args) {

        SalesOrder order1 = new SalesOrder("SO001", "Ilham", 250.000);

        order1.displayOrder();

        OrderRepository repository = new OrderRepository();
        repository.saveOrder(order1);

        OrderExporter exporter = new OrderExporter();
        exporter.exportOrderToXML(order1);
    }
}
