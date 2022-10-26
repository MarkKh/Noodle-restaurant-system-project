import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> Items = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();
        Item item = new Item();
        Table table = new Table();
        Customer customer = new Customer();
        Bill bill = new Bill();
        Income income = new Income();
        Expenses expense = new Expenses();
        
        Item[] items = new Item[4];
        items[0] = new Item("001", "Noodles blood soup", 30);
        items[1] = new Item("002", "Tom Yum noodle soup", 30);
        items[2] = new Item("003", "Steamed noodles without soup", 30);
        items[3] = new Item("004", "Steamed noodles without tom yum soup", 30);

        customer.addName("Mark Khomsan");
        customer.addPhoneNumber("0616768126");
        customer.addName("Nan kanyarat");
        customer.addPhoneNumber("0873986487");

        income.addValue(20.00);
        income.addDescription("xxxxx");
        income.addValue(40.00);
        income.addDescription("yyyyy");

        expense.addValue(330.00);
        expense.addDescription("xxxx");
        expense.addValue(1230.00);
        expense.addDescription("yyyy");

        System.out.println("\nEnter the total Menu you would like to order : ");
        int total = scanner.nextInt();

        System.out.println();
        for (int i = 0; i < total; ++i) {

            System.out.println();
            for (Item ite : items) {
                System.out.println(ite.toString());
            }

            String menu;
            System.out.println("Enter menu what you want :");
            menu = scanner.next();
            String xmenu;
            if (menu.equals("001")) {
                xmenu = "Noodles blood soup";
                options.add(xmenu);
            } else if (menu.equals("002")) {
                xmenu = "Tom Yum noodle soup";
                options.add(xmenu);
            } else if (menu.equals("003")) {
                xmenu = "Steamed noodles without soup";
                options.add(xmenu);
            } else if (menu.equals("004")) {
                xmenu = "Steamed noodles without tom yum soup";
                options.add(xmenu);
            } else {
                options.add(null);
            }

            String size;
            System.out.println("\nBowl size(Large, Medium, Small) : ");
            size = scanner.next();
            item.setSize(size);
            options.add(size);

            String RiceNoodles;
            System.out.println(
                    "\nRice Noodles(1. Rice Vermicelli, 2. Rice Stick Noodles, 3. Wide Rice Noodles, 4. Glass Noodles, 5. Egg Noodles, 6. Instant Noodles) : ");
            RiceNoodles = scanner.next();
            String xRiceNoodles;
            if (RiceNoodles.equals("1")) {
                xRiceNoodles = "Rice Vermicelli";
                options.add(xRiceNoodles);
            } else if (RiceNoodles.equals("2")) {
                xRiceNoodles = "Rice Stick Noodles";
                options.add(xRiceNoodles);
            } else if (RiceNoodles.equals("3")) {
                xRiceNoodles = "Wide Rice Noodles";
                options.add(xRiceNoodles);
            } else if (RiceNoodles.equals("4")) {
                xRiceNoodles = "Glass Noodles";
                options.add(xRiceNoodles);
            } else if (RiceNoodles.equals("5")) {
                xRiceNoodles = "Egg Noodles";
                options.add(xRiceNoodles);
            } else if (RiceNoodles.equals("6")) {
                xRiceNoodles = "Instant Noodles";
                options.add(xRiceNoodles);
            } else {
                options.add(null);
            }

            String meat;
            System.out.println(
                    "\nMeat(1. Marinated Pork, 2. Braised Pork, 3. Meatball, 4. Pork liver) : ");
            meat = scanner.next();
            String xMeat;
            if (meat.equals("1")) {
                xMeat = "Marinated Pork";
                options.add(xMeat);
            } else if (meat.equals("2")) {
                xMeat = "Braised Pork";
                options.add(xMeat);
            } else if (meat.equals("3")) {
                xMeat = "Meatball";
                options.add(xMeat);
            } else if (meat.equals("4")) {
                xMeat = "Pork liver";
                options.add(xMeat);
            } else {
                options.add(null);
            }

            String note;
            System.out.println("\nNote : ");
            note = scanner.next();
            options.add(note);

            item.setItemOptions(options);
            Items.add(item);

        }
        Order orders = new Order(Items);

        UUID randomUUID = UUID.randomUUID();
        String randomId = randomUUID.toString().replaceAll("-", "");

        orders.setOrderId(randomId);
        orders.calculateTotalOrder();
        System.out.println("\n-----------------------------Ordered is-----------------------------");
        System.out.println("Table number " + table.getTable());
        System.out.println("Ordered by  " + customer.get_Name());
        orders.printOrderSummary();
        System.out.println("--------------------------------------------------------------------\n");

        orders.setOrderPreparing(0);
        double va = orders.getOrderTotalAmount();
        String de = orders.getOrderId();
        income.addValue(va);
        income.addDescription(de);
    }
}
