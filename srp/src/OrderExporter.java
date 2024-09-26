public class OrderExporter {
    public void exportOrderToXML(SalesOrder order) {
        String xmlFormat = "<SalesOrder>\n" +
                "    <OrderId>" + order.getOrderId() + "</OrderId>\n" +
                "    <CustomerName>" + order.getCustomerName() + "</CustomerName>\n" +
                "    <Amount>" + order.getAmount() + "</Amount>\n" +
                "</SalesOrder>";
        System.out.println("Exporting order to XML:\n" + xmlFormat);
    }
}
