package learn.creational.builder;

/**
 * @author anthonylee
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder(14)
                .addCheese()
                .addLettuce()
                .addTomato()
                .build();
        burger.print();
    }
}
