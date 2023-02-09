public class Student extends Human{
    String rollNumber;
    float cpga;

    public Student(String firstName, String lastName, String cnic, String rollNumber, float cpga) {
        super(firstName, lastName, cnic);
        this.rollNumber = rollNumber;
        this.cpga = cpga;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public float getCpga() {
        return cpga;
    }

    public void setCpga(float cpga) {
        this.cpga = cpga;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber='" + rollNumber + '\'' +
                ", cpga=" + cpga +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    @Override
    public void showId(){
        System.out.println(getRollNumber());
    }
}
