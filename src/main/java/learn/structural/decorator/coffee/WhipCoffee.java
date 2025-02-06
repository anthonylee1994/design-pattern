package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class WhipCoffee extends CoffeeDecorator {
    public WhipCoffee(Coffee coffee) {
        super(coffee);
    }

    public int getCost() {
        return decoratedCoffee.getCost() + 3;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + "，加鮮奶油";
    }
}
