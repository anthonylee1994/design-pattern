package learn.creational.abs.factory.door;

/**
 * @author anthonylee
 */
public class WoodenDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("我是一個木門");
    }
}
