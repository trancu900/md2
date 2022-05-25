package codegym.inheritance.animal;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"An thit");
    }

    public void swim() {
        System.out.println(getName()+"Đang Boi");
    }
}
