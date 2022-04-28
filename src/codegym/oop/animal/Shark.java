package codegym.oop.animal;

public class Shark extends Fish implements Swimable {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "Swimming");
    }
}
