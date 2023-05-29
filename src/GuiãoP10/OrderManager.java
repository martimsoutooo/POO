
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class OrderManager {
    private Map<Integer, Order> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }

    public void removeOrder(Order order) {
        orders.remove(order.getId());
    }

    public Order searchOrder(int id) {
        return orders.get(id);
    }

    public double calculateOrderCost(int id) {
        Order order = searchOrder(id);
        if (order != null) {
            StandardOrderCostCalculator calculator = new StandardOrderCostCalculator();
            return calculator.calculateOrderCost(order);
        }
        return -1;
    }

    public void printAllOrders() {
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }

    public void printOrdersToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Order order : orders.values()) {
                String line = order.getId() + ";" +
                        order.getStoreId() + ";" +
                        formatOrderItems(order.getItems()) + ";" +
                        order.getDateTime() + ";" +
                        (order.isExpress() ? "Expresso" : "Normal") + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    private String formatOrderItems(List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.getName()).append(":").append(item.getPrice()).append("|");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}