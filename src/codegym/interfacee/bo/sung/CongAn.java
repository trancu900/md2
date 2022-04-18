package codegym.interfacee.bo.sung;

public class CongAn {
    public void capCanCuocCD(ICapCanCongDan capCanCongDan) {
        if (capCanCongDan.getCMND() == null) {
            System.out.println("can bo sung CMND");
            return;
        }
        if (capCanCongDan.getSoHK() == null) {
            System.out.println("can bo sung SoHK");
            return;
        }

        System.out.println("Dang xac minh ho so");
        System.out.println("Hoan Thanh cap CCCD");
    }
}
