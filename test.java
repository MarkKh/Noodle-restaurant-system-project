import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Income income = new Income();
        Expenses expense = new Expenses();

        income.addValue(20.00);
        income.addDescription("xxxxx");
        income.addValue(40.00);
        income.addDescription("yyyyy");

        income.printAll();

        income.printSum();


        expense.addValue(330.00);
        expense.addDescription("xxxx");
        expense.addValue(1230.00);
        expense.addDescription("yyyy");

        expense.printAll();
        expense.printSum();

        double a = income.getSum();
        double b = expense.getSum();
        System.out.println("all accoutiing  "+ (a-b));
    }
}
