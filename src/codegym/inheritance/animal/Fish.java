package codegym.inheritance.animal;

public abstract class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "Đang Boi");
    }


}
