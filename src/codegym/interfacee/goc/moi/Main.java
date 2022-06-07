package codegym.interfacee.goc.moi;

public class Main {
    public static void main(String[] args) {
        CongAn congAn = new CongAn();
        CongDanVN congDanVN = new CongDanVN();
        CongDanUS congDanUS = new CongDanUS();
        congAn.capCanCuocCongDan(congDanVN);
        congAn.capCanCuocCongDan(congDanUS);
        congAn.capCanCuocCongDan(new CongDanChina());
    }

}
