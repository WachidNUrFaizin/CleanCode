// SalesOrder.java
import java.util.ArrayList;
import java.util.List;

class SalesOrder {
    private String orderId;
    private String customerName;
    private double amount;
    private static List<SalesOrder> orderDB = new ArrayList<>();

    SalesOrder(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    void salesOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: Rp" + amount);
    }

    void saveOrder() {
        orderDB.add(this);
        System.out.println("Order saved to DB.");
    }

    void exportXML() {
        String xmlFormat = "<SalesOrder>\n" +
                "    <OrderId>" + orderId + "</OrderId>\n" +
                "    <CustomerName>" + customerName + "</CustomerName>\n" +
                "    <Amount>" + amount + "</Amount>\n" +
                "</SalesOrder>";
        System.out.println("Exporting order to XML:\n" + xmlFormat);
    }

    public static void main(String[] args) {
        SalesOrder order1 = new SalesOrder("SO001", "ilham", 250.000);
        order1.salesOrder();
        order1.saveOrder();
        order1.exportXML();
    }
}