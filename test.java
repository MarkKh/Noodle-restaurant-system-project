import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        customer.addName("Mark Khomsan");
        customer.addPhoneNumber("0616768126");
        customer.addName("Nan kanyarat");
        customer.addPhoneNumber("0873986487");


        customer.printPhone();
        customer.printName();

        String log = scanner.next();

        customer.login(log);
        System.out.println("cus name  is " + customer.get_Name());

        System.out.println("phone");
        String p = scanner.next();
        System.out.println("name");
        String n = scanner.next();
        customer.register(p,n);

        customer.printPhone();
        customer.printName();

        String logs = scanner.next();

        customer.login(logs);
        System.out.println("cus name  is " + customer.get_Name());

    }
}
