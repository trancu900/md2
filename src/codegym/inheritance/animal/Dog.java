package codegym.inheritance.animal;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+"An Tap");
    }

    public void run() {
        System.out.println(getName()+"Đang Chay");
    }
}
