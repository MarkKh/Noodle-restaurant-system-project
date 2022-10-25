public class Owner {
    private String username;
    private String password;

    public Owner() {
    }

    public boolean Login(String username, String password) {
        if (username.equals("owner@gmail.com") && password.equals("9876")) {
            return true;
        } else {
            return false;
        }
    }

    public void say() {
        System.out.println("Welcome owner!!!");
    }
}
