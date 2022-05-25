package codegym.inheritance.animal;

public class Crocodile extends Animal {
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "An Thit");
    }

    public void run() {
        System.out.println(getName() + "Chay bon chan");
    }

    public void swim() {
        System.out.println(getName() + "Dang boi");
    }
}
