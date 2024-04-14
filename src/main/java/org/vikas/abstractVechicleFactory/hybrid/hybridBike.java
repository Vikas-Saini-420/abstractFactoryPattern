package org.vikas.abstractVechicleFactory.hybrid;

import org.vikas.abstractVechicleFactory.Vehicle;

public class hybridBike implements Vehicle {
    public hybridBike() {
        System.out.println("Inside hybrid bike");
    }
    @Override
    public void drive() {
        System.out.println("Drive : hybrid bike");
    }
}
