package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.Wheel;

public class TagAlongBike extends SimpleBike {

    public TagAlongBike() {
        super();
        components.add(new SimpleBike());
    }
}
