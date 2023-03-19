class Math{

    public static double add(double a, double b){
        return a+b;
    }

}


class Car{ // PascalCasing
    public String name; // instance
    public String color;
    public int model;

    public static String vehicleType = "car";

    Car(String name, String color, int model){
        this.name = name;
        this.color = color;
        this.model = model;
    }

    //camelCase
    void getName(){
        System.out.println(this.name);
    }

    void setName(String n){ //override
        name = n;
    }

}

// todo; why this function is outside a class
//void move(Car c){
//    c.accelrate();
//}

class SportsCar extends Car{


    SportsCar(String name, String color, int model, int topSpeed){
        super(name, color, model);
        // this(name, color, model); // constructor overloading
        // this.topSpeed = topSpeed;
    }

//    public void setTopSpeed(int topSpeed) // todo: function with no body

    public void test(){
        setName("nissan");
        getName();
    }
}

