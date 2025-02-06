package learn.behavioral.visitor.animal;

import learn.behavioral.visitor.visitor.AnimalVisitor;

/**
 * @author anthonylee
 */
public class Lion implements Animal {
    public void roar() {
        System.out.println("Roaaar!");
    }

    @Override
    public String getName() {
        return "獅子";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
