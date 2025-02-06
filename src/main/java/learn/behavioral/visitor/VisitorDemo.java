package learn.behavioral.visitor;

import learn.behavioral.visitor.animal.Animal;
import learn.behavioral.visitor.animal.Dolphin;
import learn.behavioral.visitor.animal.Lion;
import learn.behavioral.visitor.animal.Monkey;
import learn.behavioral.visitor.visitor.JumpVisitor;
import learn.behavioral.visitor.visitor.SpeakVisitor;

import java.util.List;

/**
 * @author anthonylee
 */
public class VisitorDemo {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Monkey(), new Lion(), new Dolphin());

        for (Animal animal : animals) {
            animal.accept(new SpeakVisitor());
            animal.accept(new JumpVisitor());
            System.out.println();
        }
    }
}
