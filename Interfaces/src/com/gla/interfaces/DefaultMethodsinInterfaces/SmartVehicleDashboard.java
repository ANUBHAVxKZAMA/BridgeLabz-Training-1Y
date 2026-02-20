package com.gla.interfaces.DefaultMethodsinInterfaces;
interface Vehicle {
    void displaySpeed();
    // New feature for electric vehicles
    default void displayBattery() {
        System.out.println("Battery info not available.");
    }
}
class Car implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}
class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }
    @Override
    public void displayBattery() {
        System.out.println("Battery level: 75%");
    }
}
public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle normalCar = new Car();
        Vehicle electricCar = new ElectricCar();
        normalCar.displaySpeed();
        normalCar.displayBattery();  // Default
        electricCar.displaySpeed();
        electricCar.displayBattery();  // Overridden
    }
}