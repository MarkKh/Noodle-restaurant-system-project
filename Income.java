public class Income extends Accounting {
    private double[] income;

    public Income(String in_id, double in_value, String in_description) {
        super(in_id, in_value, in_description);
    }

    public double[] getIncome() {
        return income;
    }

    public void setIncome(double[] income) {
        this.income = income;
    }

    public void toString(double[] income) {
        for (double i : income) {
            System.out.println(i + "...");
        }
        System.out.println("end");
    }

}
