package codegym.interfacee.goc.moi;

public class CongDanVN implements ICapCanCuocCongDan {


    public CMND getCMND() {
        return new CMND();
    }

    public SoHK getSoHK() {
        return new SoHK();
    }

    @Override
    public void capCanCuocCDHoanThanh(CanCuocCD canCuocCD) {
            System.out.println("Cong dan VN da nhan CCCD");
    }
}
