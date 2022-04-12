package codegym.oop.abstractt;

public class Ca extends DongVatDuoiNuoc {
    public Ca(String name) {
        super(name);
    }

    public void boi() {
        System.out.println(getTen() +
                " Dang Boi");
    }

}
