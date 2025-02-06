package learn.behavioral.visitor.visitor;

import learn.behavioral.visitor.animal.Dolphin;
import learn.behavioral.visitor.animal.Lion;
import learn.behavioral.visitor.animal.Monkey;

/**
 * @author anthonylee
 */
public interface AnimalVisitor {
    void visit(Monkey monkey);
    void visit(Lion lion);
    void visit(Dolphin dolphin);
}
