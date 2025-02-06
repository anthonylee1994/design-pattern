package learn.structural.decorator.coffee;

/**
 * @author anthonylee
 */
public class VanillaCoffee extends CoffeeDecorator {
    public VanillaCoffee(Coffee coffee) {
        super(coffee);
    }

    public int getCost() {
        return decoratedCoffee.getCost() + 3;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + "，加香草";
    }
}
