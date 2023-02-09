public class Teacher extends Human{
    float salary;
    String employeeNumber;

    public Teacher(String firstName, String lastName, String cnic, float salary, String employeeNumber) {
        super(firstName, lastName, cnic);
        this.salary = salary;
        this.employeeNumber = employeeNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void showId(){
        System.out.println(getEmployeeNumber());
    }

}
