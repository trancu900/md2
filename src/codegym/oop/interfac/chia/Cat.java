package codegym.oop.interfac.chia;

public class Cat extends Animal
        implements Runable {
    public Cat(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getTen() +
                "is Running");
    }

}
