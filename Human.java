

class Human{
    String firstName;
    String lastName;
    String cnic;
    String phoneNumber;
    int age;
    String address;
    float weight;
    float height;

    public Human() {
    }

    // constructor overrloading
    public Human(String firstName, String lastName, String cnic, String phoneNumber, int age, String address, float weight, float height) {
        this(firstName, lastName, cnic);
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
        this.weight = weight;
        this.height = height;
    }

    public Human(String firstName, String lastName, String cnic) {
        setFirstName(firstName);
        setLastName(lastName);
        this.cnic = cnic;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void showId(){
        System.out.println(getCnic());
    }
}