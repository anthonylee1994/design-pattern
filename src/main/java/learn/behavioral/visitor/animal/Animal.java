package learn.behavioral.visitor.animal;

import learn.behavioral.visitor.visitor.AnimalVisitor;

/**
 * @author anthonylee
 */
public interface Animal {
    String getName();

    void accept(AnimalVisitor visitor);
}
