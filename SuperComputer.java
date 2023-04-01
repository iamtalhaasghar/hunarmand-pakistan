public class SuperComputer extends Computer {

    SuperComputer(String model, String manfacturer){
        super(model, manfacturer);
    }
    public void doCalculation(){
        System.out.println("i can perform calculations but better.");
    }
}
