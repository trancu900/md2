package codegym;

import codegym.inheritance.animal.Animal;
import codegym.inheritance.animal.Crocodile;
import codegym.inheritance.animal.Dog;
import codegym.inheritance.animal.Fish;
import codegym.inheritance.geometric.Circle;
import codegym.inheritance.geometric.Cylinder;
import codegym.inheritance.geometric.Rectangle;
import codegym.inheritance.geometric.Shape;

public class Main {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile("Ghea");
        Dog dog = new Dog("Mi Ngu");
        Fish fish = new Fish("Ca vang boi chao lửa");
        Animal[] animals = new Animal[]{
                crocodile, dog, fish
        };
        for (Animal animal : animals) {
            showSkill(animal);
        }

    }

    public static void showSkill(Animal animal) {
        animal.eat();
        if (animal instanceof Fish)
            ((Fish) animal).swim();
        if (animal instanceof Dog)
            ((Dog) animal).run();
        if (animal instanceof Crocodile) {
            ((Crocodile) animal).run();
            ((Crocodile) animal).swim();
        }

    }


}