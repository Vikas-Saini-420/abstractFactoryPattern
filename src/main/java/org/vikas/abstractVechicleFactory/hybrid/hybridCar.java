package org.vikas.abstractVechicleFactory.hybrid;

import org.vikas.abstractVechicleFactory.Vehicle;

public class hybridCar implements Vehicle {
    public hybridCar() {
        System.out.println("Inside hybrid car");
    }
    @Override
    public void drive() {
        System.out.println("Drive : hybrid car");
    }
}
