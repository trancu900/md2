package codegym.oop;

public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.setAge(age);
        this.eat();
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Tuoi khong am");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void eat() {
        System.out.printf("%s eating", name);
    }
}
