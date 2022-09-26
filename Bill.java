public class Bill {
    private String bill_id;
    private String bill_date;
    private String order_list;
    private String customer_name;
    

    public Bill() {
    }

    public String getBillId() {
        return bill_id;
    }

    public void setBillId(String bill_id) {
        this.bill_id = bill_id;
    }

    public String getBillDate() {
        return bill_date;
    }

    public void setBillDate(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getOrderlist() {
        return order_list;
    }

    public void setOrderlist(Order order_list) {
        this.order_list = order_list.printOrderSummary();
    }

    public String getCustomerName() {
        return customer_name;
    }

    public void setCustomerName(Customer customer_name) {
        this.customer_name = customer_name.getName();
    }

    public void createBill(){
        
        System.out.println("");
        System.out.println(getBillDate());
        System.out.println(getOrderlist());
        System.out.println(getCustomerName());
        System.out.println(getBillId());
    }

    
}
