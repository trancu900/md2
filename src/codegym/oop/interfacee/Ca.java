package codegym.oop.interfacee;

public class Ca extends DongVat
        implements DongVatDuoiNuoc {
    public Ca(String name) {
        super(name);
    }

    public void boi() {
        System.out.println(getTen() +
                " Dang Boi");
    }

}
