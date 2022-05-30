package codegym.inheritance.animal;

public class BirdChich extends Animal implements Flyable {
    public BirdChich(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " An Sau");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " Dang bay");
    }
}
