public class Customer extends Person {
    private int customer_point;

    public Customer(String customer_id,String customer_name,String customer_phoneNumber,String customer_emailAddress,String customer_password,int customer_point){
        super(customer_id,customer_name,customer_phoneNumber,customer_emailAddress,customer_password);
        this.customer_point = customer_point;
    }

    public int getCustomerPoint(){
        return customer_point;
    }

    public void setCustomerPoint(int customer_point) {
        this.customer_point = customer_point;	
    }
}
