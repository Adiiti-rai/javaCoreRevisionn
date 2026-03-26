package org.example.abstractfactorymethod;

//Concrete implementation of Car and Bike for electric variant.
//Provides behavior specific to electric cars and Bikes.

public class ElectricCar implements Car{
    public void drive(){
        System.out.println("drive the electric car");
    }
}
class ElectricBike implements Bike{
    public void ride(){
        System.out.println("rideing the electric bike");
    }
}
