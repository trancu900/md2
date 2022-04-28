package codegym.oop.animal;

public class Phoenix
        extends
        Animal implements Flyable {
    public Phoenix(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Flying");
    }
}
