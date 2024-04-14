package org.vikas.abstractVechicleFactory.hybrid.factory;

import org.vikas.abstractVechicleFactory.VechicleFactory;
import org.vikas.abstractVechicleFactory.Vehicle;
import org.vikas.abstractVechicleFactory.hybrid.hybridBike;
import org.vikas.abstractVechicleFactory.hybrid.hybridCar;
import org.vikas.abstractVechicleFactory.hybrid.hybridTruck;

public class HybridVehicleFactory implements VechicleFactory {


    @Override
    public Vehicle produce(String vehicleType) {
        return switch (vehicleType) {
            case "hybridbike" -> new hybridBike();
            case "hybridcar" -> new hybridCar();
            case "hybridtruck" -> new hybridTruck();
            default -> null;
        };
    }
}
