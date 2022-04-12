package codegym.oop.interfac.chia;

public class Main {
    public static Runable runable;
    public static void main(String[] args) {
        Runable meo = new Cat("Tom");
        test((Animal) meo);
        Swimmable ca = new Fish("Nemo");
        test((Animal) ca);
        Animal caSau = new Crocodile("Dungx");
        test(caSau);
        Animal penguin = new Penguin("Canh Cut");
        test(penguin);
        Bird bird = new Bird("Angry Bird ");
        test((Animal) bird);
    }

    private static void test(Animal animal) {
        if (animal instanceof Runable)
            ((Runable) animal).run();
        if (animal instanceof Swimmable)
            ((Swimmable) animal).swim();
        if (animal instanceof Flyable)
            ((Flyable) animal).fly();
    }
}
