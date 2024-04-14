package org.vikas.abstractVechicleFactory;

import org.vikas.abstractVechicleFactory.electrical.factory.EletricalVehicleFactory;
import org.vikas.abstractVechicleFactory.gasoline.factory.GasolineVechicleFactory;
import org.vikas.abstractVechicleFactory.hybrid.factory.HybridVehicleFactory;

public final class VehicleFactoryProducer {

    private VehicleFactoryProducer() {
        throw new AssertionError();
    }

    public static VechicleFactory getVehicleFactory(String vehicleType) {

        if (vehicleType.equalsIgnoreCase("hybrid")) {
            return new HybridVehicleFactory();
        } else if (vehicleType.equalsIgnoreCase("gasoline")) {
            return new GasolineVechicleFactory();
        } else if (vehicleType.equalsIgnoreCase("electrical")) {
            return new EletricalVehicleFactory();
        } else {
            return null;
        }
    }
}
