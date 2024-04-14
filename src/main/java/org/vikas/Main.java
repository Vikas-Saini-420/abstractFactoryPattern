package org.vikas;

import org.vikas.abstractVechicleFactory.VechicleFactory;
import org.vikas.abstractVechicleFactory.VehicleFactoryProducer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        VechicleFactory eletricalVehicleFactory = VehicleFactoryProducer.getVehicleFactory("electrical");
        eletricalVehicleFactory.produce("electricbike").drive();
        eletricalVehicleFactory.produce("electriccar").drive();
        eletricalVehicleFactory.produce("electrictruck").drive();

        VechicleFactory gasolineVehicleFactory = VehicleFactoryProducer.getVehicleFactory("gasoline");
        gasolineVehicleFactory.produce("gasolinecar").drive();
        gasolineVehicleFactory.produce("gasolinebike").drive();
        gasolineVehicleFactory.produce("gasolinetruck").drive();

        VechicleFactory hybridVehicleFactory = VehicleFactoryProducer.getVehicleFactory("hybrid");
        hybridVehicleFactory.produce("hybridcar").drive();
        hybridVehicleFactory.produce("hybridbike").drive();
        hybridVehicleFactory.produce("hybridtruck").drive();
    }
}