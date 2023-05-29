import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


class OrderTester {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        // Adicionar pedidos
        Item item1 = new Item("Item 1", 10.0);
        Item item2 = new Item("Item 2", 15.0);
        Item item3 = new Item("Item 3", 20.0);

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        Order order1 = new Order(items1, "Loja A", false);

        List<Item> items2 = new ArrayList<>();
        items2.add(item3);
        Order order2 = new Order(items2, "Loja B", true);

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        // Remover um pedido
        orderManager.removeOrder(order1);

        // Ler dados dos pedidos de um arquivo
        readOrdersFromFile("pedidos.txt", orderManager);

        // Procurar um pedido específico
        int orderId = 2;
        Order searchedOrder = orderManager.searchOrder(orderId);
        if (searchedOrder != null) {
            System.out.println("Order found: " + searchedOrder);
        } else {
            System.out.println("Order not found");
        }

        // Imprimir informações de todos os pedidos
        System.out.println("All Orders:");
        orderManager.printAllOrders();

        // Calcular o custo de um pedido
        double orderCost = orderManager.calculateOrderCost(orderId);
        if (orderCost != -1) {
            System.out.println("Order cost: $" + orderCost);
        } else {
            System.out.println("Order not found");
        }

        // Calcular o custo de todos os pedidos de um mês (exemplo)
        LocalDateTime currentDate = LocalDateTime.now();
        int currentMonth = currentDate.getMonthValue();
        double totalCostOfMonth = 0.0;
        for (Order order : orderManager.getAllOrders()) {
            if (order.getDateTime().getMonthValue() == currentMonth) {
                totalCostOfMonth += orderManager.calculateOrderCost(order.getId());
            }
        }
        System.out.println("Total cost of current month: $" + totalCostOfMonth);


        // Imprimir a lista de pedidos para um arquivo
        orderManager.printOrdersToFile("lista_pedidos.txt");
    }

    private static void readOrdersFromFile(String filename, OrderManager orderManager) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                String storeId = data[1];
                List<Item> items = parseOrderItems(data[2]);
                boolean express = data[4].equals("Expresso");

                Order order = new Order(items, storeId, express);
                orderManager.addOrder(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Item> parseOrderItems(String itemsData) {
        List<Item> items = new ArrayList<>();
        String[] itemsArray = itemsData.split("\\|");
        for (String itemString : itemsArray) {
            String[] itemData = itemString.split(":");
            String name = itemData[0];
            double price = Double.parseDouble(itemData[1]);
            Item item = new Item(name, price);
            items.add(item);
        }
        return items;
    }
}
