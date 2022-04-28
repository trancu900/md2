package codegym.oop.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Shark("Baby Shark"),
                new Cat("Hoang Thuong"),
                new Snail("Oc Sen"),
                new Crocodile("Ca Sau"),
                new Phoenix("Phuong Hoang Lua")
        };
        for (Animal animal : animals) {
            show(animal);
        }
    }

    private static void show(Animal animal) {
        if (animal instanceof Flyable)
            ((Flyable) animal).fly();
        if (animal instanceof Runnable)
            ((Runnable) animal).run();
        if (animal instanceof Swimable)
            ((Swimable) animal).swim();
//    else
//        if(animal instanceof  Runnable)
//            ((Runnable) animal).run();
//        else
//            if()
    }

}
