package org.vikas.abstractVechicleFactory.electrical;

import org.vikas.abstractVechicleFactory.Vehicle;

public class electricalCar implements Vehicle {

    public electricalCar() {
        System.out.println("Inside electrical car");
    }

    @Override
    public void drive() {
        System.out.println("Drive : electrical car");
    }
}
