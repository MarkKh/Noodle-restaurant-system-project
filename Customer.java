public class Customer {
    private String customer_name;
    private String customer_phoneNumber;
    public static int count = 0;


    public Customer(String customer_name, String customer_phoneNumber) {
        this.customer_name = customer_name;
        this.customer_phoneNumber = customer_phoneNumber;
        count++;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public void setCustomerName(String customerName) {
        this.customer_name = customer_name;
    }

    public String getCustomerPhone() {
        return customer_phoneNumber;
    }

    public void setCustomerPhone(String customerPhoneNumber) {
        this.customer_phoneNumber = customer_phoneNumber;
    }

    public void customerLogin(String obj) {
        for(int i = 0; i < count ;i++){
            if(getCustomerPhone().equals(obj)){
                System.out.println(getCustomerName());
            }
        }
    }

}
