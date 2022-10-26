import java.util.*;

public class Item {
    private String item_id;
    private String item_name;
    private double item_price;
    private String size;
    private ArrayList<String> item_options = new ArrayList<>();

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setItemOptions(ArrayList<String> options) {
        this.item_options = options;
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

    public void setItemPrice(double item_price) {
        this.item_price = item_price;
    }

    public String toString() {
        return this.getItemId() + " " + this.getItemName() + " " + this.getItemPrice() + " Baht";
    }

}
