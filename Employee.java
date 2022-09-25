public class Employee extends Person {
    private String employee_position;

    public Employee(String employee_id,String employee_name,String employee_phoneNumber,String employee_emailAddress,String employee_password,String employee_position) {
        super(employee_id, employee_name, employee_phoneNumber,employee_emailAddress, employee_password);
        this.employee_position = employee_position;
    }

    public String getEmployee_position() {
        return employee_position;
    }

    public void setEmployee_position(String employee_position) {
        this.employee_position = employee_position;
    }
}
