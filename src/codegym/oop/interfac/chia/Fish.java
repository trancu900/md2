package codegym.oop.interfac.chia;

public class Fish extends Animal
        implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getTen() +
                " is Swimming");
    }

}
