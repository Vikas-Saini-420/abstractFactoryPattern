package org.vikas.abstractVechicleFactory.electrical;

import org.vikas.abstractVechicleFactory.Vehicle;

public class electricalBike  implements Vehicle {

    // default constructor
    public void eletricalBike() {
        System.out.println("Inside electrical bike");
    }

    @Override
    public void drive() {
        System.out.println("Drive : electrical bike");
    }
}
