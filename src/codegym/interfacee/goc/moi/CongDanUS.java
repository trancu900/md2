package codegym.interfacee.goc.moi;

public class CongDanUS implements ICapCanCuocCongDan {

    private CanCuocCD canCuocCD;

    public CMND getCMND() {
        return new CMND();
    }

    public SoHK getSoHK() {
        return new SoHK();
    }

    //callback
    @Override
    public void capCanCuocCDHoanThanh(CanCuocCD canCuocCD) {
        System.out.println("Cong dan US da nhan CCCD");
    }
}
