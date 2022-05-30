package codegym.inheritance.animal;

public class Shark extends Fish {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("An Thit");
    }
}
