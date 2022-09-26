import java.util.ArrayList;

public class Item {
    private String item_id;
    private String item_name;
    private double item_price;
    private ArrayList<String> item_options;

    public Item(String item_id, String item_name, double item_price) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public Item() {
    }

    public ArrayList<String> getItemOptions() {
        return item_options;
    }

    public String getItemId() {
        return item_id;
    }

    public void setItemId(String item_id) {
        this.item_id = item_id;
    }

    public String getItemName() {
        return item_name;
    }

    public void setItemName(String item_name) {
        this.item_name = item_name;
    }

    public double getItemPrice() {
        return item_price;
    }

    public void setItemPrice(Double item_price) {
        this.item_price = item_price;
    }
}
