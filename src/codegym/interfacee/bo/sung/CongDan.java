package codegym.interfacee.bo.sung;

public class CongDan implements ICapCanCongDan {
    @Override
    public CMND getCMND() {
        return new CMND();
    }

    @Override
    public SoHK getSoHK() {
        return new SoHK();
    }
}
