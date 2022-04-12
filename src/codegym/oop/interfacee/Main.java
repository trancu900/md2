package codegym.oop.interfacee;

import codegym.oop.interfac.chia.*;

public class Main {
    public static void main(String[] args) {
        Runable meo = new Cat("Tom");
        test((DongVat) meo);
        Swimmable ca = new Fish("Nemo");
        test((DongVat) ca);
        DongVat caSau = new CaSau("Dungx");
        test(caSau);
    }

    private static void test(DongVat dongVat) {
        if (dongVat instanceof Runable)
            ((Runable) dongVat).run();
        if (dongVat instanceof Swimmable)
            ((Swimmable) dongVat).swim();
    }
}
