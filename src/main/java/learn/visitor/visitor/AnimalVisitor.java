package learn.visitor.visitor;

import learn.visitor.animal.Dolphin;
import learn.visitor.animal.Lion;
import learn.visitor.animal.Monkey;

/**
 * @author anthonylee
 */
public interface AnimalVisitor {
    void visit(Monkey monkey);
    void visit(Lion lion);
    void visit(Dolphin dolphin);
}
