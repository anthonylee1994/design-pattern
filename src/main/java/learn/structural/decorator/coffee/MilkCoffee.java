package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    public int getCost() {
        return decoratedCoffee.getCost() + 2;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + "，加奶";
    }
}
