public class Bill {
    private String bill_date;
    private Item item;
    private Order order_list;
    private Table table;
    private Customer customer_name;

    public Bill() {
    }

    public String getBillDate() {
        return bill_date;
    }

    public void setBillDate(String bill_date) {
        this.bill_date = bill_date;
    }

    public void showBill() {
            System.out.println("              Kuaitiao Ruea Thukpak Sakha BuengSamPhan              ");
            System.out.println("                      " + getBillDate() + "                       ");
    }

}
