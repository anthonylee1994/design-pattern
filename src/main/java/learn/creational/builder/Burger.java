package learn.creational.builder;

/**
 * @author anthonylee
 */
public class Burger {
    private final int size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean lettuce;
    private final boolean tomato;

    private Burger(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    public void print() {
        System.out.println("漢堡大小: " + size);
        System.out.println("芝士: " + (cheese ? "有" : "無"));
        System.out.println("意大利辣香腸: " + (pepperoni ? "有" : "無"));
        System.out.println("生菜: " + (lettuce ? "有" : "無"));
        System.out.println("番茄: " + (tomato ? "有" : "無"));
    }

    public static class Builder {
        private final int size;
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean lettuce = false;
        private boolean tomato = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public Builder addTomato() {
            this.tomato = true;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
