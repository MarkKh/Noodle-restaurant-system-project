import java.util.*;

public class Accounting {
    private ArrayList<Double> values = new ArrayList<Double>();
    private ArrayList<String> descriptions = new ArrayList<String>();

    public Accounting() {
    }

    public ArrayList<Double> getValues() {
        return values;
    }

    public ArrayList<String> getDescription() {
        return descriptions;
    }

    public void addValue(Double value) {
        this.values.add(value);
    }

    public void addDescription(String description) {
        this.descriptions.add(description);
    }

    public void printAll() {
        System.out.println("-------------------------");
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i) + "     " + descriptions.get(i));
        }
        System.out.println("-------------------------");
    }

    public void printSum() {
        System.out.println("-------------------------");
        System.out.println("Sum all is : " + getSum());
        System.out.println("-------------------------");

    }

    public double getSum() {
        return values.stream().mapToDouble(f -> f.doubleValue()).sum();
    }
}
