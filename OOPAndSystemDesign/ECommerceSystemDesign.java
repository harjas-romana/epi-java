// SYSTEM DESIGN EXAMPLE - E-Commerce Product Management System
// Demonstrates integration of multiple OOP concepts and design patterns

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ECommerceSystemDesign {

    // Product Class - Encapsulation
    static class Product {
        private String productId;
        private String name;
        private double price;
        private int stock;

        public Product(String productId, String name, double price, int stock) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public boolean decreaseStock(int quantity) {
            if (stock >= quantity) {
                stock -= quantity;
                return true;
            }
            return false;
        }

        public void increaseStock(int quantity) {
            stock += quantity;
        }
    }

    // Shopping Cart - Aggregation
    static class ShoppingCart {
        private List<CartItem> items = new ArrayList<>();
        private double totalPrice = 0;

        static class CartItem {
            Product product;
            int quantity;

            CartItem(Product product, int quantity) {
                this.product = product;
                this.quantity = quantity;
            }
        }

        public void addProduct(Product product, int quantity) {
            if (product.decreaseStock(quantity)) {
                items.add(new CartItem(product, quantity));
                totalPrice += product.getPrice() * quantity;
                System.out.println("Added " + quantity + " x " + product.getName());
            } else {
                System.out.println("Insufficient stock for " + product.getName());
            }
        }

        public void displayCart() {
            System.out.println("\n--- Shopping Cart ---");
            for (CartItem item : items) {
                System.out.println(item.product.getName() + " x " + item.quantity +
                        " = $" + (item.product.getPrice() * item.quantity));
            }
            System.out.println("Total: $" + totalPrice);
        }

        public double getTotalPrice() {
            return totalPrice;
        }
    }

    // Inventory Manager - Singleton Pattern
    static class InventoryManager {
        private static InventoryManager instance = null;
        private Map<String, Product> products = new HashMap<>();

        private InventoryManager() {
        }

        public static synchronized InventoryManager getInstance() {
            if (instance == null) {
                instance = new InventoryManager();
            }
            return instance;
        }

        public void addProduct(Product product) {
            products.put(product.getProductId(), product);
        }

        public Product getProduct(String productId) {
            return products.get(productId);
        }

        public void displayInventory() {
            System.out.println("\n--- Inventory ---");
            for (Product product : products.values()) {
                System.out.println(product.getName() + " - $" + product.getPrice() +
                        " (Stock: " + product.getStock() + ")");
            }
        }
    }

    // Order Processor - Strategy Pattern
    interface OrderProcessor {
        void processOrder(ShoppingCart cart, String customerId);
    }

    static class StandardOrderProcessor implements OrderProcessor {
        @Override
        public void processOrder(ShoppingCart cart, String customerId) {
            System.out.println("\nProcessing standard order for customer: " + customerId);
            System.out.println("Amount to pay: $" + cart.getTotalPrice());
            System.out.println("Order confirmed!");
        }
    }

    static class ExpressOrderProcessor implements OrderProcessor {
        @Override
        public void processOrder(ShoppingCart cart, String customerId) {
            System.out.println("\nProcessing express order for customer: " + customerId);
            System.out.println("Amount to pay: $" + (cart.getTotalPrice() * 1.15) + " (includes 15% express fee)");
            System.out.println("Express order confirmed! (Ships within 24 hours)");
        }
    }

    // Notification System - Observer Pattern
    interface OrderObserver {
        void update(String orderId, String status);
    }

    static class EmailNotifier implements OrderObserver {
        @Override
        public void update(String orderId, String status) {
            System.out.println("Email sent: Order " + orderId + " status is now " + status);
        }
    }

    static class SMSNotifier implements OrderObserver {
        @Override
        public void update(String orderId, String status) {
            System.out.println("SMS sent: Order " + orderId + " status is now " + status);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== E-Commerce System ===");

        // Initialize inventory
        InventoryManager inventory = InventoryManager.getInstance();
        inventory.addProduct(new Product("P001", "Laptop", 999.99, 10));
        inventory.addProduct(new Product("P002", "Mouse", 29.99, 50));
        inventory.addProduct(new Product("P003", "Keyboard", 79.99, 30));

        inventory.displayInventory();

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(inventory.getProduct("P001"), 1);
        cart.addProduct(inventory.getProduct("P002"), 2);
        cart.displayCart();

        // Process order with strategy pattern
        OrderProcessor processor = new StandardOrderProcessor();
        processor.processOrder(cart, "CUST001");

        System.out.println("\n--- Using Express Processor ---");
        OrderProcessor expressProcessor = new ExpressOrderProcessor();
        expressProcessor.processOrder(cart, "CUST002");

        inventory.displayInventory();
    }
}
