package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class MilkCoffee implements Coffee {
    private final Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost() + 2;
    }

    public String getDescription() {
        return coffee.getDescription() + "，加奶";
    }
}
