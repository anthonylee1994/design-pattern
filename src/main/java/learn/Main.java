package learn;

import learn.behavioral.visitor.animal.Animal;
import learn.behavioral.visitor.animal.Dolphin;
import learn.behavioral.visitor.visitor.JumpVisitor;
import learn.behavioral.visitor.animal.Lion;
import learn.behavioral.visitor.animal.Monkey;
import learn.behavioral.visitor.visitor.SpeakVisitor;

import java.util.List;

/**
 * @author anthonylee
 */
public class Main {
    public static void main(String[] args) {
        visitorPattern();
    }

    private static void visitorPattern() {
        List<Animal> animals = List.of(new Monkey(), new Lion(), new Dolphin());

        for (Animal animal : animals) {
            animal.accept(new SpeakVisitor());
            animal.accept(new JumpVisitor());
            System.out.println();
        }
    }
}
