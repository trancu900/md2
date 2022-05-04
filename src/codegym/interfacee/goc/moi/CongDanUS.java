package codegym.interfacee.goc.moi;

public class CongDanUS implements ICapCanCuocCongDan{
    public CMND getCMND() {
        return new CMND();
    }

    @Override
    public void capCanCongDanHoanThanh(CCCD cccd) {
        System.out.println("Cong dan US da nhan CCCD");
    }

    public SoHK getSoHK() {
        return new SoHK();
    }

}
