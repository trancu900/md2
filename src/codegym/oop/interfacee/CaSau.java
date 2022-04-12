package codegym.oop.interfacee;


public class CaSau extends DongVat
        implements DongVatDuoiNuoc, DongVatTrenCan {
    public CaSau(String name) {
        super(name);
    }

    @Override
    public void boi() {
        System.out.println("Ca sau" + getTen() + "Dang boi");
    }

    public void chay() {
        System.out.println("ca sau " + getTen() + "dang chay");
    }

}
