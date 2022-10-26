public class Bill {
    private String bill_date;

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
