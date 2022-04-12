package codegym.oop.interfacee;

import codegym.oop.interfac.chia.Runable;

public class Meo extends DongVat
        implements Runable {
    public Meo(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getTen() +
                " Dang Chay");
    }

}
