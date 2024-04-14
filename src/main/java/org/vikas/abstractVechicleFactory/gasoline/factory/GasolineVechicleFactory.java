package org.vikas.abstractVechicleFactory.gasoline.factory;

import org.vikas.abstractVechicleFactory.VechicleFactory;
import org.vikas.abstractVechicleFactory.Vehicle;
import org.vikas.abstractVechicleFactory.gasoline.gasolineBike;
import org.vikas.abstractVechicleFactory.gasoline.gasolineCar;
import org.vikas.abstractVechicleFactory.gasoline.gasolineTruck;

public class GasolineVechicleFactory implements VechicleFactory {
    @Override
    public Vehicle produce(String vehicleType) {
        return switch (vehicleType) {
            case "gasolinecar" -> new gasolineCar();
            case "gasolinebike" -> new gasolineBike();
            case "gasolinetruck" -> new gasolineTruck();
            default -> null;
        };
    }
}
