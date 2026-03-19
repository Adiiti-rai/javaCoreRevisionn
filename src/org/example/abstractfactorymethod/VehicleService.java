package org.example.abstractfactorymethod;
//Client class.
// Uses the factory to create objects without knowing their concrete classes.

public class VehicleService {
    public static void main(String[] args){
        VehicleFactory factory= new PetrolFactory();// choose type

        Car car =factory.createCar();
       Bike bike = factory.createBike();
       car.drive();
       bike.ride();
        VehicleFactory factory1= new ElectricFactory();
        Car car1= factory1.createCar();
        Bike bike1= factory1.createBike();
        car1.drive();
        bike1.ride();
    }
}
