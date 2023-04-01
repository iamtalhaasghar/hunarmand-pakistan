class Test{

    public static void main(String[] args) {
      Computer pentium4 = new Computer("pentium 4", "dell");
      SuperComputer frontier = new SuperComputer("HPE Cray EX235a", "HPE");
      Computer macbook = new Laptop("macbook pro", "Apple", 12);

      Laptop p4laptop = (Laptop) macbook;
      System.out.println(p4laptop.getBatteryTiming());

      // polymorphism in action
      Computer[] computers = {macbook, frontier, pentium4};
        for (Computer computer : computers) {
            computer.doCalculation();
        }

    }
}