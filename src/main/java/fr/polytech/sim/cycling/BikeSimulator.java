package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.log.LoggerStaticFactory;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = LoggerStaticFactory.fabricate("BikeSimulator"); // new ConsoleLogger("BikeSimulator");


    public void run() {
        Iterator<Bike> iterator = Context.injectAll(Bike.class);
        while (iterator.hasNext()) {
            Bike bike = iterator.next();
            assert bike != null;
            this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
            this.logger.log("Bike's mass %.2f Kg.", bike.getMass());
        }
    }
}
