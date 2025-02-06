package learn.visitor.animal;

import learn.visitor.visitor.AnimalVisitor;

/**
 * @author anthonylee
 */
public interface Animal {
    String getName();

    void accept(AnimalVisitor visitor);
}
