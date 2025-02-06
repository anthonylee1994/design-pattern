package learn.creational.abs.factory.factory;

import learn.creational.abs.factory.door.Door;
import learn.creational.abs.factory.expert.DoorFittingExpert;

/**
 * @author anthonylee
 */
public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}
