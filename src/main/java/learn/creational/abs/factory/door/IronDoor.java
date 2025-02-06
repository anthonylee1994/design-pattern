package learn.creational.abs.factory.door;

/**
 * @author anthonylee
 */
public class IronDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("我是一個鐵門");
    }
}
