import java.util.ArrayList;

public class Order {
    private String order_id;
    private final ArrayList<Item> order_list;
    private int order_preparing_status = 0;
    private double order_total_amount;

    public Order(ArrayList<Item> order_list) {
        this.order_list = order_list;
    }

    public ArrayList<Item> order_list(){
        return order_list;
    }
 
    public String getOrderId() {
        return order_id;
    }

    public void setOrderId(String order_id) {
        this.order_id = order_id;
    }

    public int getOrderPreparingStatus() {
        return order_preparing_status;
    }

    public void setOrderPreparingStatus(int order_preparing_status) {
        this.order_preparing_status = order_preparing_status;
    }

    public Double getOrderTotalAmount() {
        return order_total_amount;
    }

    public String printOrderSummary() {
        return "" ;
    }

    public void calculateTotalOrder() {
        
    }

}
