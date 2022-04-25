package codegym.interfacee.bo.sung;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CongAn congAn=new CongAn();
        CongDan congDan=new CongDan();
        try {
            congAn.capCanCuocCD(congDan);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally {
            System.out.println("Finally");
        }
        //ArrayList
    }

}
