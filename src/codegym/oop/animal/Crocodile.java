package codegym.oop.animal;

public class Crocodile
        extends Animal
        implements Swimable,
        Runnable {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " Swimming");
    }

    @Override
    public void run() {
        System.out.println(getName() + " Running");
    }
}
