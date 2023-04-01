public class Computer {
    public String model; // optilex, alien ware, envy
    public String manfacturer;

    Computer(){}

    public Computer(String model, String manfacturer) {
        this.model = model;
        this.manfacturer = manfacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model; // Optilex
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public void setManfacturer(String manfacturer) {
        this.manfacturer = manfacturer;
    }

    public void doCalculation(){
        System.out.println("i can perform calculations");
    }

}
