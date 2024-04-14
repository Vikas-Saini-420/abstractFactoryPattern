package org.vikas.abstractVechicleFactory.gasoline;

import org.vikas.abstractVechicleFactory.Vehicle;

public class gasolineCar implements Vehicle {
    public gasolineCar() {
        System.out.println("Inside gasoline car");
    }
    @Override
    public void drive() {
        System.out.println("Drive : gasoline car");
    }
}
