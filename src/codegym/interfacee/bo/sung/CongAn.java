package codegym.interfacee.bo.sung;

public class CongAn {
    public void capCanCuocCD(ICapCanCongDan capCanCongDan) {
        if (capCanCongDan.getCMND() == null) {
            throw new CMNDNotFoundException("Can Bo sung CMND");
        }
        if (capCanCongDan.getSoHK() == null) {
            throw new SHKNotFoundException("Can Bo SUng SHK");
        }

        System.out.println("Dang xac minh ho so");
        System.out.println("Hoan Thanh cap CCCD");
    }

}
