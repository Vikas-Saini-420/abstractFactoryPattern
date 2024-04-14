package org.vikas.abstractVechicleFactory.electrical;

import org.vikas.abstractVechicleFactory.Vehicle;

public class electricalTruck implements Vehicle {
    public electricalTruck() {
        System.out.println("Inside electrical truck");
    }

    @Override
    public void drive() {
        System.out.println("Drive : electrical truck");
    }
}
