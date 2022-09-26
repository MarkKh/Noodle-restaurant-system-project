public class Accounting {
    private String id;
    private double value;
    private String description;
    private double balance;
    private double[] totalValue;

    public Accounting(String id, double value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public Accounting(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double[] getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double[] value) {
        this.totalValue = value;
    }

    public void showTotalValue(double[] totalValue) {
        for (double i : totalValue) {
            System.out.println(i + "...");
        }
        System.out.println("end");
    }
}
