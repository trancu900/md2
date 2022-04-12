package codegym.oop.abstractt;

public class Main {
    public static void main(String[] args) {
        DongVat meo = new Meo("Tom");
        DongVat ca = new Ca("Nemo");
        test(ca);
        test(meo);
    }

    private static void test(DongVat animal) {
        if (animal instanceof DongVatTrenCan)
            ((DongVatTrenCan) animal).chay();
        if (animal instanceof DongVatDuoiNuoc)
            ((DongVatDuoiNuoc) animal).boi();
    }
}
