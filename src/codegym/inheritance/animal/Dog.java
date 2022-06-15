package codegym.inheritance.animal;

public class Dog extends Animal implements Runable,AutoCloseable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "An Tap");
    }

    @Override
    public void run() {
        System.out.println(getName() + "Đang Chay");
    }

    @Override
    public void close() throws Exception {

    }
}
