class StandardOrderCostCalculator implements OrderCostCalculator {
    public double calculateOrderCost(Order order) {
        return order.calculateOrderCost(order);
    }
}