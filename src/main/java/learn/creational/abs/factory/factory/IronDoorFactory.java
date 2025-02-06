package learn.creational.abs.factory.factory;

import learn.creational.abs.factory.door.Door;
import learn.creational.abs.factory.door.IronDoor;
import learn.creational.abs.factory.expert.DoorFittingExpert;
import learn.creational.abs.factory.expert.Welder;

/**
 * @author anthonylee
 */
public class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
