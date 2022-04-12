package codegym.oop.interfac.chia;

public abstract class Animal {
    private String ten;

    public Animal(String name) {
        this.ten = name;
    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return "My name is " + ten;
    }


}