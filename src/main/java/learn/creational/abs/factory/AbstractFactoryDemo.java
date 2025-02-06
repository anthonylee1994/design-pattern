package learn.creational.abs.factory;

import learn.creational.abs.factory.door.Door;
import learn.creational.abs.factory.expert.DoorFittingExpert;
import learn.creational.abs.factory.factory.DoorFactory;
import learn.creational.abs.factory.factory.IronDoorFactory;
import learn.creational.abs.factory.factory.WoodenDoorFactory;

/**
 * @author anthonylee
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        DoorFactory woodenFactory = new WoodenDoorFactory();
        Door door = woodenFactory.makeDoor();
        DoorFittingExpert expert = woodenFactory.makeFittingExpert();
        door.getDescription();  // 輸出：我是一個木門
        expert.getDescription(); // 輸出：我只能安装木門

        DoorFactory ironFactory = new IronDoorFactory();
        door = ironFactory.makeDoor();
        expert = ironFactory.makeFittingExpert();
        door.getDescription();  // 輸出：我是一個鐵門
        expert.getDescription(); // 輸出：我只能安装鐵門
    }
}
