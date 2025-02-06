package learn.visitor.visitor;

import learn.visitor.animal.Dolphin;
import learn.visitor.animal.Lion;
import learn.visitor.animal.Monkey;

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
