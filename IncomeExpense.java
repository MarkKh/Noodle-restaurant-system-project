public class IncomeExpense {
    private String income_expense_id;
    private int income;
    private int expense;

    public IncomeExpense(String income_expense_id, int income, int expense) {
        this.income_expense_id = income_expense_id;
        this.income = income;
        this.expense = expense;
    }

    public String getIncomeExpenseId() {
        return income_expense_id;
    }

    public void setIncomeExpenseId(String income_expense_id) {
        this.income_expense_id = income_expense_id;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getExpense() {
        return expense;
    }

}
