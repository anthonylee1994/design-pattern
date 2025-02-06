package learn.visitor.animal;

import learn.visitor.visitor.AnimalVisitor;

/**
 * @author anthonylee
 */
public class Dolphin implements Animal {
    public void speak() {
        System.out.println("Tuut tuttu tuutt!");
    }

    @Override
    public String getName() {
        return "海豚";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
