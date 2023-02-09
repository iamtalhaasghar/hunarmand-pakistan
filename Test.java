import java.util.Scanner;

class Test{
    public static void main(String []args){
        Human john  = new Human("John", "Dude", "0000-0000000-0");
        Human talha = new Student("talha", "asghar", "0000-0000000-0", "ST-12345", (float)2.5);
        Human andrew = new Teacher("Andrew", "Ng", "0000-0000000-0", 50000,"TCH-12345");

        // function over-riding
        john.showId();
        talha.showId();
        andrew.showId();

        Shape shapes[] = {new Rectangle(4, 2), new Circle(7)};

        for (Shape tempShape: shapes) {
            tempShape.calculateArea(); // polymorphism
        }

    }
}


abstract class Shape{
    abstract void calculateArea();
}

class Rectangle extends Shape{

    double width;
    double height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea(){
        System.out.println(width * height);
    }
}

class Circle extends Shape{

    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println(2 * 3.14 * radius);
    }
}