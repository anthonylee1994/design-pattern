package learn.structural.decorator;

import learn.structural.decorator.coffee.Coffee;
import learn.structural.decorator.coffee.MilkCoffee;
import learn.structural.decorator.coffee.SimpleCoffee;
import learn.structural.decorator.coffee.VanillaCoffee;
import learn.structural.decorator.coffee.WhipCoffee;

/**
 * @author anthonylee
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee someCoffee = new SimpleCoffee();
        System.out.println(someCoffee.getCost());       // 10
        System.out.println(someCoffee.getDescription()); // 一杯咖啡

        someCoffee = new MilkCoffee(someCoffee);
        System.out.println(someCoffee.getCost());       // 12
        System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶

        someCoffee = new WhipCoffee(someCoffee);
        System.out.println(someCoffee.getCost());       // 17
        System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶，加鮮奶油

        someCoffee = new VanillaCoffee(someCoffee);
        System.out.println(someCoffee.getCost());        // 20
        System.out.println(someCoffee.getDescription()); // 一杯咖啡，加奶，加鮮奶油，加香草
    }
}
