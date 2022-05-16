package codegym.interfacee.goc.moi;

public class CongDanVN implements ICapCanCuocCongDan {
    public CMND getCMND() {
        return new CMND();
    }

    @Override
    public void capCanCongDanHoanThanh(CCCD cccd) {
        System.out.println("Cong dan VN đã nhận cccd");
    }

    public SoHK getSoHK() {
        return null;
    }
}
