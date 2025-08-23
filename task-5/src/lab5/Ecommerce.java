package lab5;

class Order {
    void printDetails() {
        System.out.println("Order ID: 12345");
        System.out.println("Order Date: 2025-08-23");
    }
}

class OnlineOrder extends Order {
    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Delivery Address: 123 Main St, Cityville");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder();
        onlineOrder.printDetails();
    }
}