package codegym.inheritance.animal;

public class Crocodile extends Animal {
    @Override
    //Annotation
    public void eat() {
        System.out.println("An Thit");
    }

    @Override
    public void move() {
        System.out.println("Chay bon chan");
    }

    public void swim(){
        System.out.println("Dang boi");
    }
}
