package org.example.abstractfactorymethod;
//Concrete factory for petrol vehicles.
// Creates a family of petrol-based products (Car and Bike).

 public class PetrolFactory implements VehicleFactory{
    public Car createCar(){
        return new PetrolCar();
    }
    public Bike createBike(){
        return new PetrolBike();
    }

}
// Concrete factory for electric vehicles.
//  Creates a family of electric-based products (Car and Bike).
class ElectricFactory implements VehicleFactory{
      public Car createCar(){
         return new ElectricCar();
     }
   public   Bike createBike(){
         return new ElectricBike();
     }
}

