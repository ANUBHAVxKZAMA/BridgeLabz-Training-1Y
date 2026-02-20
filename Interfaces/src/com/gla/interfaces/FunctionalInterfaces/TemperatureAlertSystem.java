package com.gla.interfaces.FunctionalInterfaces;
@FunctionalInterface
interface TemperatureCheck {
    boolean check(double temperature);
}
public class TemperatureAlertSystem {
    public static void main(String[] args) {
        TemperatureCheck alert = temp -> temp > 40;
        double temperature = 42;
        if (alert.check(temperature)) {
            System.out.println("High Temperature Alert!");
        } else {
            System.out.println("Temperature is Normal.");
        }
    }
}