package codegym.oop.abstractt;

public abstract class DongVat {
    private String ten;

    public DongVat(String name) {
        this.ten = name;
    }

    public String getTen() {
        return ten;
    }

    public String toString() {
        return "My name is " + ten;
    }


}