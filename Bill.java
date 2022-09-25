public class Bill {
     private String bill_id;
     private double total_price;
     private int table_number;
     private Order order;

     public Bill(String bill_id, double total_price, int table_number, Order order) {
          this.bill_id = bill_id;
          this.total_price = total_price;
          this.table_number = table_number;
          this.order = order;

     }

     public String getBillId() {
          return bill_id;
     }

     public void setBillId(String bill_id) {
          this.bill_id = bill_id;
     }

     public double total_price() {
          return total_price;
     }

     public void setTotalPrice(double total_price) {
          this.total_price = total_price;
     }

     public int getTable_Number() {
          return table_number;
     }

     public void setTable_Number(int table_number) {
          this.table_number = table_number;
     }

     public Order getOrder() {
          return order;
     }

     public void setOrder(Order order) {
          this.order = order;
     }
}
