class Test{

    public static void main(String[] args) {
        Course pf  = new Course("programming fundamental", "CS101", "M. Ali", "Morning"); // instantiation operator / object creation / instantiation
        System.out.println("name of course:"+pf.getName());
        System.out.println(pf.getInstructor());
        Course oop = new Course();
        System.out.println(oop.getName());


    }
}