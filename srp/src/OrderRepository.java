import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<SalesOrder> orderDB = new ArrayList<>();

    public void saveOrder(SalesOrder order) {
        orderDB.add(order);
        System.out.println("Order saved to DB.");
    }

    public List<SalesOrder> getAllOrders() {
        return orderDB;
    }
}
