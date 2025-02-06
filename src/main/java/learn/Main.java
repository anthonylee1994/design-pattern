package learn;

import learn.visitor.animal.Animal;
import learn.visitor.animal.Dolphin;
import learn.visitor.visitor.JumpVisitor;
import learn.visitor.animal.Lion;
import learn.visitor.animal.Monkey;
import learn.visitor.visitor.SpeakVisitor;

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
