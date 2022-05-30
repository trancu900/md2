package codegym;

import codegym.inheritance.animal.*;
import codegym.inheritance.geometric.Circle;
import codegym.inheritance.geometric.Cylinder;
import codegym.inheritance.geometric.Rectangle;
import codegym.inheritance.geometric.Shape;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("CHO CAI");
        Fish fish = new Shark("Baby Shark");
        Crocodile crodile = new Crocodile("Cau Sau");
        BirdChich birdChich = new BirdChich("Chich ");

        showSkill(crodile);
        showSkill(birdChich);
        showSkill(fish);
        showSkill(dog);
    }

    public static void showSkill(Animal animal) {
        animal.eat();
        if (animal instanceof Flyable)
            ((Flyable) animal).fly();
        if (animal instanceof Runable)
            ((Runable) animal).run();
        if (animal instanceof Swimmable)
            ((Swimmable) animal).swim();

    }

    //
//    public static void showSkill(ITerrestrialAnimal animal) {
//        animal.run();
//    }
//    public static void showSkill(IMarineAnimal animal) {
//        animal.swim();
//    }


}