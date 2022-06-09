package codegym.interfacee.goc.moi;

import codegym.interfacee.goc.moi.exceptions.CMNDException;
import codegym.interfacee.goc.moi.exceptions.SoHoKhauException;

public class Main {
    public static void main(String[] args) {
        CongAn congAn = new CongAn();
        CongDanVN congDanVN = new CongDanVN();
        CongDanUS congDanUS = new CongDanUS();
     //   try {
            congAn.capCanCuocCongDan(congDanVN);
//        } catch (CMNDException ex) {
//            System.out.println("ve ddi lay cmnd");
//        } catch (SoHoKhauException ex) {
//            System.out.println("ve ddi lay so ho khau");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("finally");
//        }


    }
}
