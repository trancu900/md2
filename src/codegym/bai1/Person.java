package codegym.bai1;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    //let age;
    private String name;
    private int age;
    private double price;

    public Person(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
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

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.age - o.age;
        if (result == 0) {
            double dResult = this.price - o.price;
            return dResult == 0 ? 0 : (dResult > 0 ? 1 : -1);
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
