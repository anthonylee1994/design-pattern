package learn.behavioral.visitor.visitor;

import learn.behavioral.visitor.animal.Dolphin;
import learn.behavioral.visitor.animal.Lion;
import learn.behavioral.visitor.animal.Monkey;

/**
 * @author anthonylee
 */
public class SpeakVisitor implements AnimalVisitor {
    @Override
    public void visit(Monkey monkey) {
        monkey.shout();
    }

    @Override
    public void visit(Lion lion) {
        lion.roar();
    }

    @Override
    public void visit(Dolphin dolphin) {
        dolphin.speak();
    }
}
