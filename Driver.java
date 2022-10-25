import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> Items = new ArrayList<>();

        Item[] item = new Item[4];
        item[0] = new Item("001", "Noodles blood soup", 30);
        item[1] = new Item("002", "Tom Yum noodle soup", 30);
        item[2] = new Item("003", "Steamed noodles without soup", 30);
        item[3] = new Item("004", "Steamed noodles without tom yum soup", 30);

        while (true) {
            System.out.println("Who are you?");
            System.out.println("1. Customer");
            System.out.println("2. Employee");
            System.out.println("3. Owner");
            System.out.println("0. Exit");

            System.out.println("Please enter 1-3 or 0 for exit : ");
            int who = scanner.nextInt();

            if (who == 1) {

                System.out.println("Enter the total Menu you would like to order : ");
                int total = scanner.nextInt();

                for (int i = 0; i < total; ++i) {
                    Item itemm = new Item();

                    ArrayList<String> option = new ArrayList<>();

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
                    } else {
                        xmenu = "Steamed noodles without tom yum soup";
                        option.add(xmenu);
                    }

                    String size;
                    System.out.println("Bowl size(Large, Medium, Small) : ");
                    size = scanner.next();
                    itemm.setSize(size);
                    option.add(size);

                    String RiceNoodles;
                    System.out.println(
                            "Rice Noodles(1. Rice Vermicelli, 2. Rice Stick Noodles, 3. Wide Rice Noodles, 4. Glass Noodles, 5. Egg Noodles, 6. Instant Noodles) : ");
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
                    } else {
                        xRiceNoodles = "Instant Noodles";
                        option.add(xRiceNoodles);
                    }

                    String meat;
                    System.out.println("Meat(1. Marinated Pork, 2. Braised Pork, 3. Meatball, 4. Pork liver) : ");
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
                    } else {
                        xMeat = "Pork liver";
                        option.add(xMeat);
                    }

                    String note;
                    System.out.println("Note : ");
                    note = scanner.next();
                    option.add(note);

                    itemm.setItemOptions(option);
                    Items.add(itemm);
                }

                Order order = new Order(Items);
                order.calculateTotalOrder();
                order.printOrderSummary();

            } else if (who == 2) {
                Employee employee = new Employee();
                System.out.println("Username : ");
                String username = scanner.next();
                System.out.println("Password : ");
                String password = scanner.next();
                boolean x = employee.Login(username, password);
                if (x == true){
                    employee.say();
                } else {
                    System.out.println("Please try again");
                }
               
                //Order order = new Order(Items);
                //order.printOrderSummary();
            } else if (who == 3) {
                Owner owner = new Owner();
                System.out.println("Username : ");
                String username = scanner.next();
                System.out.println("Password : ");
                String password = scanner.next();
                boolean x =  owner.Login(username, password);
                if(x == true){
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
