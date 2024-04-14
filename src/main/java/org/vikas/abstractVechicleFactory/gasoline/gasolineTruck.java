package org.vikas.abstractVechicleFactory.gasoline;

import org.vikas.abstractVechicleFactory.Vehicle;

public class gasolineTruck implements Vehicle {
    public gasolineTruck() {
        System.out.println("Inside gasoline truck");
    }
    @Override
    public void drive() {
        System.out.println("Drive : gasoline truck");
    }
}
