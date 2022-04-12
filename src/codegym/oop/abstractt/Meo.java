package codegym.oop.abstractt;

public class Meo extends DongVatTrenCan {
    public Meo(String name) {
        super(name);
    }

    public void chay() {
        System.out.println(getTen() +
                " Dang Chay");
    }

}
