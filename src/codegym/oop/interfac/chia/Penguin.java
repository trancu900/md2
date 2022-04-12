package codegym.oop.interfac.chia;

public class Penguin extends Animal implements Runable, Swimmable {
    public Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(getTen() + "Dang boi");
    }

    @Override
    public void run() {
        System.out.println(getTen() + "dang chay");
    }
}
