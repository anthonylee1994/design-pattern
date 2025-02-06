package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class SimpleCoffee implements Coffee {
    public int getCost() {
        return 10;
    }

    public String getDescription() {
        return "一杯咖啡";
    }
}
