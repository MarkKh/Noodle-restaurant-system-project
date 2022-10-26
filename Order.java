import java.util.ArrayList;
import java.util.UUID;


public class Order {
    private String order_id;
    private final ArrayList<Item> Items;
    private double order_total_amount;


    public Order(ArrayList<Item> Items) {
        this.Items = Items;
    }

    public ArrayList<Item> Items() {
        return Items;
    }

    public String getOrderId() {
        UUID randomUUID = UUID.randomUUID();
        order_id = randomUUID.toString().replaceAll("-", "");
        return order_id;
    }



    public Double getOrderTotalAmount() {
        return order_total_amount;
    }


    public void printOrderSummary() {
        double amount = 0;
        System.out.println();

        for (Item item : Items) {
            if (item.getSize().equalsIgnoreCase("Small") || item.getSize().equalsIgnoreCase("s")) {
                amount = 30;
            } else if (item.getSize().equalsIgnoreCase("Medium") || item.getSize().equalsIgnoreCase("m")) {
                amount = 40;
            } else if (item.getSize().equalsIgnoreCase("Large") || item.getSize().equalsIgnoreCase("l")) {
                amount = 50;
            }
            System.out.println(item.getItemOptions() + " " + amount + " Baht");
        }
        
        System.out.println("Total price of this order is " + getOrderTotalAmount() + " Baht");
        System.out.println();
        System.out.println("Order id "+getOrderId());
    }

    public void calculateTotalOrder() {
        final double Small = 0;
        final double Medium = 10;
        final double Large = 20;
        order_total_amount = 0;

        for (Item item : Items) {
            order_total_amount += 30;
            if (item.getSize().equalsIgnoreCase("Small") || item.getSize().equalsIgnoreCase("s")) {
                order_total_amount += Small;
            } else if (item.getSize().equalsIgnoreCase("Medium") || item.getSize().equalsIgnoreCase("m")) {
                order_total_amount += Medium;
            } else if (item.getSize().equalsIgnoreCase("Large") || item.getSize().equalsIgnoreCase("l")) {
                order_total_amount += Large;
            }
        }
    }

}
