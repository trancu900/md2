package codegym.inheritance.animal;

public class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void move() {
        System.out.println("Moving");
    }
}
