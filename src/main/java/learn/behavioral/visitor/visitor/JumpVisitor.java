package learn.behavioral.visitor.visitor;

import learn.behavioral.visitor.animal.Dolphin;
import learn.behavioral.visitor.animal.Lion;
import learn.behavioral.visitor.animal.Monkey;

/**
 * @author anthonylee
 */
public class JumpVisitor implements AnimalVisitor {
    @Override
    public void visit(Monkey monkey) {
        System.out.println(monkey.getName() + "跳了 20 英尺高！跳到了樹上去！");
    }

    @Override
    public void visit(Lion lion) {
        System.out.println(lion.getName() +"跳了 7 英尺高！回到了地上！");
    }

    @Override
    public void visit(Dolphin dolphin) {
        System.out.println(dolphin.getName() +"探出了水面一點隨後消失了");
    }
}
