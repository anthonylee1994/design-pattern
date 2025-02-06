package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class VanillaCoffee implements Coffee {
    private final Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost() + 3;
    }

    public String getDescription() {
        return coffee.getDescription() + "，加香草";
    }
}
