package codegym.interfacee.goc.moi;

import codegym.exceptions.CMNDException;
import codegym.exceptions.SoHKException;

public class Main {
    static int[] numbers;

    public static void main(String[] args) {

        CongDanUS cdUS = new CongDanUS();
        CongAn congAn = new CongAn();
        try {
            congAn.capCanCuocCongDan(cdUS);
        } catch (SoHKException e) {
            System.out.println("So Hk Nhe");
            e.printStackTrace();
        } catch (CMNDException e) {
            System.out.println("So CMND Meo");
        } finally {
            System.out.println("Tao la Finaly");
        }
    }
}
