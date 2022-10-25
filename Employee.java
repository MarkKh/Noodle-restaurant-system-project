public class Employee extends Owner {
    private String employee_position;

    public Employee() {
    }

    public String getEmployee_position() {
        return employee_position;
    }

    public void setEmployee_position(String employee_position) {
        this.employee_position = employee_position;
    }

    @Override

    public boolean Login(String username, String password) {
        if (username.equals("employee1@gmail.com") && password.equals("em01")) {
            return true;
        } else if (username.equals("employee2@gmail.com") && password.equals("em02")) {
            return true;
        } else if (username.equals("employee3@gmail.com") && password.equals("em03")) {
            return true;
        } else {
            return false;
        }
    }

    public void say() {
        System.out.println("Welcome Employee!!!");
    }
}
