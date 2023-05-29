import java.time.LocalDateTime;
import java.util.List;

public class Order implements OrderCostCalculator {

    private static int nextId = 1;
    private int id;
    private List<Item> items;
    private String storeId;
    private LocalDateTime dateTime;
    private boolean express;

    public Order(List<Item> items, String storeId, boolean express) {
        this.id = nextId++;
        this.items = items;
        this.storeId = storeId;
        this.dateTime = LocalDateTime.now();
        this.express = express;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }


    public String getStoreId() {
        return storeId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public boolean isExpress() {
        return express;
    }

    public double calculateOrderCost(Order order) {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        if (express) {
            totalCost *= 1.3; 
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + items +
                ", storeId='" + storeId + '\'' +
                ", dateTime=" + dateTime +
                ", express=" + express +
                '}';
    }
}