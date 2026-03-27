package org.example.abstractfactorymethod;

//Concrete implementation of Car and Bike for petrol variant.
// Provides behavior specific to petrol cars and Bikes.

public class PetrolCar implements Car {
    public void drive(){
        System.out.println("drive the petrol car");

    }
}
 class PetrolBike implements Bike{
    public void ride(){
        System.out.println("riding the petrol bike");
    }
 }
