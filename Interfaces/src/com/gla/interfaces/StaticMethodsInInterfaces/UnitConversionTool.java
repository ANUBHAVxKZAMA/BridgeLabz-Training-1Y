package com.gla.interfaces.StaticMethodsInInterfaces;
interface UnitConverter{
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
public class UnitConversionTool {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;
        System.out.println("10 km in miles: " + UnitConverter.kmToMiles(km));
        System.out.println("5 kg in lbs: " + UnitConverter.kgToLbs(kg));
    }
}