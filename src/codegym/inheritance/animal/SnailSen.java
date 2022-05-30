package codegym.inheritance.animal;

public class SnailSen extends Animal {
    public SnailSen(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(" An la cay");
    }
}
