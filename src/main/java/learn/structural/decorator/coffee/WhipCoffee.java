package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class WhipCoffee implements Coffee {
    private final Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public int getCost() {
        return coffee.getCost() + 3;
    }

    public String getDescription() {
        return coffee.getDescription() + "，加鮮奶油";
    }
}
