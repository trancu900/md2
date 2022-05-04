package codegym.interfacee.goc.moi;

public class Main {
    public static void main(String[] args) {
        CongDanVN cdVN = new CongDanVN();
        CongDanUS cdUS=new CongDanUS();
        CongAn congAn = new CongAn();
        congAn.capCanCuocCongDan(cdUS);
        congAn.capCanCuocCongDan(cdVN);
    }


}
