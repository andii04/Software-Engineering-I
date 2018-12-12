package Airplane.stowage_cargo;

import Airport.Base.Container;
import Airport.Base.ContainerType;

public class StowageNumberFive implements IStowageNumberFive {

    private Container container;

    // Konstruktor
    //
    StowageNumberFive() {
        this.container = null;
    }

    // load-Funktion
    // füllt die Variable container mit dem übergebenen Parameter, solange dieser vom ContainerType AKH ist
    // returns:
    //  false -> ContainerType != AKH || Stowage schon beladen
    //  true -> ContainerType = AKH
    public boolean load(Container container) {
        if(container.getType() != ContainerType.AKH || this.container != null) { return false; }
        this.container = container;
        return true;
    }

    //
    public Container unload() {
        Container helpObject = this.container;
        if(helpObject != null) { this.container = null; }
        return helpObject;
    }

    //
    public double weightOfStowageNumberFive() {
        return container.getWeight();
    }

}
