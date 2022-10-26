import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> Items = new ArrayList<>();
        Table table = new Table();
        Customer customer = new Customer();
        Item itemm = new Item();
        Order orders = new Order(Items);
        Bill bill = new Bill();
        ArrayList<String> option = new ArrayList<>();

        Item[] item = new Item[4];
        item[0] = new Item("001", "Noodles blood soup", 30);
        item[1] = new Item("002", "Tom Yum noodle soup", 30);
        item[2] = new Item("003", "Steamed noodles without soup", 30);
        item[3] = new Item("004", "Steamed noodles without tom yum soup", 30);

        customer.addName("Mark Khomsan");
        customer.addPhoneNumber("0616768126");
        customer.addName("Nan kanyarat");
        customer.addPhoneNumber("0873986487");

        while (true) {
            System.out.println("Who are you?");
            System.out.println("1. Customer");
            System.out.println("2. Employee");
            System.out.println("3. Owner");
            System.out.println("0. Exit");

            System.out.println("Please enter 1-3 or 0 for exit : ");
            int who = scanner.nextInt();

            if (who == 1) {

                System.out.println("\n1. Login" + "\n2. Register");
                int a = scanner.nextInt();

                if (a == 1) {
                    System.out.println("Enter your phone number : ");
                    String phone = scanner.next();
                    boolean b = customer.login(phone);

                    if (b == true) {
                        System.out.println("Hello " + customer.get_Name());
                        String tableNumber;

                        System.out.println("\nChoose one");
                        System.out.println("1.at restaurant" + "\n2.Take home");
                        System.out.println("Enter 1 or 2 : ");
                        int choose = scanner.nextInt();
                        if (choose == 1) {
                            System.out.println("\nEnter table number : ");
                            tableNumber = scanner.next();
                            table.setTable(tableNumber);
                        } else if (choose == 2) {
                            tableNumber = "[ Take home ]";
                            table.setTable(tableNumber);
                        }

                        System.out.println("\nEnter the total Menu you would like to order : ");
                        int total = scanner.nextInt();

                        System.out.println();
                        for (int i = 0; i < total; ++i) {

                            for (Item ite : item) {
                                System.out.println(ite.toString());
                            }

                            String menu;
                            System.out.println("Enter menu what you want :");
                            menu = scanner.next();
                            String xmenu;
                            if (menu.equals("001")) {
                                xmenu = "Noodles blood soup";
                                option.add(xmenu);
                            } else if (menu.equals("002")) {
                                xmenu = "Tom Yum noodle soup";
                                option.add(xmenu);
                            } else if (menu.equals("003")) {
                                xmenu = "Steamed noodles without soup";
                                option.add(xmenu);
                            } else if (menu.equals("004")) {
                                xmenu = "Steamed noodles without tom yum soup";
                                option.add(xmenu);
                            } else {
                                option.add(null);
                            }

                            String size;
                            System.out.println("\nBowl size(Large, Medium, Small) : ");
                            size = scanner.next();
                            itemm.setSize(size);
                            option.add(size);

                            String RiceNoodles;
                            System.out.println(
                                    "\nRice Noodles(1. Rice Vermicelli, 2. Rice Stick Noodles, 3. Wide Rice Noodles, 4. Glass Noodles, 5. Egg Noodles, 6. Instant Noodles) : ");
                            RiceNoodles = scanner.next();
                            String xRiceNoodles;
                            if (RiceNoodles.equals("1")) {
                                xRiceNoodles = "Rice Vermicelli";
                                option.add(xRiceNoodles);
                            } else if (RiceNoodles.equals("2")) {
                                xRiceNoodles = "Rice Stick Noodles";
                                option.add(xRiceNoodles);
                            } else if (RiceNoodles.equals("3")) {
                                xRiceNoodles = "Wide Rice Noodles";
                                option.add(xRiceNoodles);
                            } else if (RiceNoodles.equals("4")) {
                                xRiceNoodles = "Glass Noodles";
                                option.add(xRiceNoodles);
                            } else if (RiceNoodles.equals("5")) {
                                xRiceNoodles = "Egg Noodles";
                                option.add(xRiceNoodles);
                            } else if (RiceNoodles.equals("6")) {
                                xRiceNoodles = "Instant Noodles";
                                option.add(xRiceNoodles);
                            } else {
                                option.add(null);
                            }

                            String meat;
                            System.out.println(
                                    "\nMeat(1. Marinated Pork, 2. Braised Pork, 3. Meatball, 4. Pork liver) : ");
                            meat = scanner.next();
                            String xMeat;
                            if (meat.equals("1")) {
                                xMeat = "Marinated Pork";
                                option.add(xMeat);
                            } else if (meat.equals("2")) {
                                xMeat = "Braised Pork";
                                option.add(xMeat);
                            } else if (meat.equals("3")) {
                                xMeat = "Meatball";
                                option.add(xMeat);
                            } else if (meat.equals("4")) {
                                xMeat = "Pork liver";
                                option.add(xMeat);
                            } else {
                                option.add(null);
                            }

                            String note;
                            System.out.println("\nNote : ");
                            note = scanner.next();
                            option.add(note);

                            itemm.setItemOptions(option);
                            Items.add(itemm);

                        }

                        UUID randomUUID = UUID.randomUUID();
                        String randomId = randomUUID.toString().replaceAll("-", "");

                        orders.setOrderId(randomId);
                        orders.calculateTotalOrder();
                        System.out.println("\n-----------------------------Ordered is-----------------------------");
                        System.out.println("Table number " + table.getTable());
                        System.out.println("Ordered by  " + customer.get_Name());
                        orders.printOrderSummary();
                        System.out.println("--------------------------------------------------------------------\n");
                    }
                } else if (a == 2) {
                    System.out.println("Enter your phone : ");
                    String p = scanner.next();
                    System.out.println("Enter your name : ");
                    String n = scanner.next();
                    customer.register(p, n);
                } else {
                }

            } else if (who == 2) {
                Employee employee = new Employee();
                System.out.println("Username : ");
                String username = scanner.next();
                System.out.println("Password : ");
                String password = scanner.next();
                boolean x = employee.Login(username, password);
                if (x == true) {
                    employee.say();

                    while (true) {
                        System.out.println("\n1. CheckOrdering" + "\n2. Receipt" + "\n0. exit");

                        System.out.println("What will you do?");
                        int employee_do = scanner.nextInt();

                        if (employee_do == 0) {
                            break;
                        } else if (employee_do == 1) {

                            if (orders.getOrderPreparing() == 1) {
                                System.out.println("");
                            } else {
                                System.out.println(
                                        "--------------------------------------------------------------------");
                                System.out.println("Table number " + table.getTable());
                                System.out.println("Ordered by  " + customer.get_Name());
                                orders.printOrderSummary();
                                System.out
                                        .println(
                                                "--------------------------------------------------------------------\n");

                                System.out.println("\nHave you completed this order(Y/N) ?");
                                String CheckOrderPreparing = scanner.next();

                                if (CheckOrderPreparing.equalsIgnoreCase("y")) {
                                    orders.setOrderPreparing(1);
                                }
                            }

                        } else if (employee_do == 2) {
                            String timeStamp = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss")
                                    .format(Calendar.getInstance().getTime());
                            bill.setBillDate(timeStamp);
                            System.out.println("\n-----------------------------  Bill ------------------------------");
                            bill.showBill();
                            System.out.println("Table number " + table.getTable());
                            orders.printOrderSummary();
                            System.out.println("Ordered by  " + customer.get_Name());
                            System.out
                                    .println("--------------------------------------------------------------------\n");

                            System.out.println("do yo want to clear this order(Y/N) ?");
                            String choose = scanner.next();
                            if (choose.equalsIgnoreCase("y")) {
                                orders.setOrderId(null);
                                table.setTable(null);
                                Items.clear();
                            } else {

                            }
                        }

                    }

                } else {
                    System.out.println("Please try again");
                }

            } else if (who == 3) {
                Owner owner = new Owner();
                System.out.println("Username : ");
                String username = scanner.next();
                System.out.println("Password : ");
                String password = scanner.next();
                boolean x = owner.Login(username, password);
                if (x == true) {
                    owner.say();
                } else {
                    System.out.println("Please try again");
                }

            } else if (who == 0) {
                break;
            } else {
                System.out.println("Please enter again!!");
            }
        }

    }

}
