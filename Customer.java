import java.util.*;
public class Customer {
    private ArrayList<String> phoneNumbers = new ArrayList<String>();
    private ArrayList<String> names = new ArrayList<String>();
    private String name;

    public Customer(){}

    public ArrayList<String> getPhoneNumbers(){
        return phoneNumbers;
    }

    public void addPhoneNumber(String phone){
        this.phoneNumbers.add(phone);
    }
    
    public ArrayList<String> getName() {
        return names;
    }

    public void addName(String name){
        this.names.add(name);
    }

    public void printPhone(){
        for(String phone : phoneNumbers){
            System.out.println(phone);
        }
    }

    public void printName(){
        for(String name : names){
            System.out.println(name);
        }
    }

    public boolean login(String password){
        int x = phoneNumbers.indexOf(password);

        this.name = names.get(x);
        return true;
    }

    public void register(String p,String n){
        this.phoneNumbers.add(p);
        this.names.add(n);
    }

    public String get_Name(){
        return name;
    }

    public void set_Name(String name){
        this.name = name;
    }

}
