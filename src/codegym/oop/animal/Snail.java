package codegym.oop.animal;

public class Snail
        extends Animal
        implements Runnable {
    public Snail(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println(getName() + " Running");
    }


}
