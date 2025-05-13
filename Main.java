public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", 120);
        Car mycar1 = new Car("Green", 140);
        myCar.displayInfo();
        mycar1.displayInfo();
    }
}

class Car {
    String color;
    int speed;

    public Car(String c, int s) {
        color = c;
        speed = s;
    }

    public void displayInfo() {
        System.out.println("Car color: " + color);
        System.out.println("Car speed: " + speed + " km/h");
    }
}
