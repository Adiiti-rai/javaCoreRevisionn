package org.example.abstractfactorymethod;
//Abstract factory interface.
// Declares methods for creating related objects (Car and Bike).

public interface VehicleFactory {
    Car createCar();
    Bike createBike();
}
