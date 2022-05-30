package codegym.inheritance.animal;

public class Crocodile extends Animal implements Runable, Swimmable {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "An Thit");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "Dang boi");
    }

    @Override
    public void run() {
        System.out.println(getName() + "Chay bon chan");

    }
}
