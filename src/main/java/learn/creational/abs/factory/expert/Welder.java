package learn.creational.abs.factory.expert;

/**
 * @author anthonylee
 */
public class Welder implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("我只能安装鐵門");
    }
}
