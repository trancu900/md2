package codegym.oop.interfac.chia;

public class Crocodile extends Animal implements Swimmable, Runable {
    public Crocodile(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Ca sau" + getTen() + "Dang boi");
    }

    @Override
    public void run() {
        System.out.println("ca sau " + getTen() + "dang chay");
    }
}
