package inheritanceDemo;

class Vehicle{
    void start() {
        System.out.println("start the vehicle");
    }
}

class Car extends Vehicle {
    void carDrive () {
        System.out.println("Start the car");
    }
}

class Bus extends Vehicle {
    void drive() {
        System.out.println("start the bus");
    }
}

public class HierarchicalInheritanceDemo  {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.carDrive();

        Bus b = new Bus();
        b.start();
        b.drive();
    }
}