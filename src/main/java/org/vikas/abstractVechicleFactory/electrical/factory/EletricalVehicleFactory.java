package org.vikas.abstractVechicleFactory.electrical.factory;

import org.vikas.abstractVechicleFactory.VechicleFactory;
import org.vikas.abstractVechicleFactory.Vehicle;
import org.vikas.abstractVechicleFactory.electrical.electricalBike;
import org.vikas.abstractVechicleFactory.electrical.electricalCar;
import org.vikas.abstractVechicleFactory.electrical.electricalTruck;

public class EletricalVehicleFactory implements VechicleFactory {

    @Override
    public Vehicle produce(String vehicleType) {
        return switch (vehicleType) {
            case "electricbike" -> new electricalBike();
            case "electriccar" -> new electricalCar();
            case "electrictruck" -> new electricalTruck();
            default -> null;
        };
    }
}
