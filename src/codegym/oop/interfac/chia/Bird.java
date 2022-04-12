package codegym.oop.interfac.chia;

public class Bird extends Animal
        implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getTen() + "is Flying");
    }

}
