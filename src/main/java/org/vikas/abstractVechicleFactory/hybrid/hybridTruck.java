package org.vikas.abstractVechicleFactory.hybrid;

import org.vikas.abstractVechicleFactory.Vehicle;

public class hybridTruck implements Vehicle {
    public hybridTruck() {
        System.out.println("Inside hybrid truck");
    }
    @Override
    public void drive() {
        System.out.println("Drive : hybrid truck");
    }
}
