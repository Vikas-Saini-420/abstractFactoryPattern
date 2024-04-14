package org.vikas.abstractVechicleFactory.gasoline;

import org.vikas.abstractVechicleFactory.Vehicle;

public class gasolineBike implements Vehicle {
    public gasolineBike() {
        System.out.println("Inside gasoline bike");
    }

    @Override
    public void drive() {
        System.out.println("Drive : gasoline bike");
    }
}

