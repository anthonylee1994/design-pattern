package learn.creational.abs.factory.factory;

import learn.creational.abs.factory.door.Door;
import learn.creational.abs.factory.door.WoodenDoor;
import learn.creational.abs.factory.expert.Carpenter;
import learn.creational.abs.factory.expert.DoorFittingExpert;

/**
 * @author anthonylee
 */
public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
