package learn.behavioral.visitor.animal;

import learn.behavioral.visitor.visitor.AnimalVisitor;

/**
 * @author anthonylee
 */
public class Monkey implements Animal {
    public void shout() {
        System.out.println("Ooh oo aa aa!");
    }

    @Override
    public String getName() {
        return "猴子";
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
