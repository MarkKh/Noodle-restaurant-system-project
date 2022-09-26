public class Expenses extends Accounting {
    private double[] expenses;

    public Expenses(String ex_id, double ex_value, String ex_description) {
        super(ex_id, ex_value, ex_description);
    }

    public double[] getExpenses() {
        return expenses;
    }

    public void setExpenses(double[] expenses) {
        this.expenses = expenses;
    }

    public void toString(double[] expenses) {
        for (double i : expenses) {
            System.out.println(i + ".....");
        }
        System.out.println("end");
    }

}