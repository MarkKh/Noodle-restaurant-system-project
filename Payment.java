public class Payment {
     private int payment_id;
     private double amount;


     public Payment(int payment_id, double amount){
          this.payment_id = payment_id;
          this.amount = amount;
     }

     public int getPrement_id(){
          return payment_id;
     }

     public double getAmount(){
          return amount;
     }
}
