package aula04;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    
    private ArrayList<Product> products;

    public CashRegister(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void printReceipt(){
        System.out.println("\nProduct            Price   Quantity       Total");
        double total = 0;
        for (Product p: products){
            double totalPrice = p.getPrice() * p.getQuantity();
            System.out.printf("%-16s %7.2f %10d %11.2f\n",p.getName(), p.getPrice(), p.getQuantity(), p.getTotalValue());
            total += totalPrice;
        }
        System.out.println("");
        System.out.println("Total value: "+ total);
    }



}

public class exercicio2 {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        cr.printReceipt();

    }
}