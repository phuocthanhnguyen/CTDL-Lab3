package Task2;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    private OrderItem[] items;

    public Order(OrderItem[] items) {
        this.items = items;
    }

    public boolean contains(Product p) {
        for (OrderItem item : items) {
            if (item.getP().equals(p)) {
                return true;
            }
        }
        return false;



    }
    public double cost() {
        double totalCost = 0.0;
        for (OrderItem item : items) {

            Product product = item.getP();
            int quantity = item.getQuality();
            totalCost += product.getPrice() * quantity;
        }

        return totalCost;
    }
    public Product[] filter(String type) {
        int count = 0;
        for (OrderItem item : items) {
            if (item.getP().getType().equals(type)) {
                count++;
            }
        }

        Product[] filteredProducts = new Product[count];
        int index = 0;

        for (OrderItem item : items) {
            if (item.getP().getType().equals(type)) {
                filteredProducts[index++] = item.getP();
            }
        }


        return filteredProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
