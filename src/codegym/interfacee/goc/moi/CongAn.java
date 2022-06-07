package codegym.interfacee.goc.moi;

public class CongAn {
    public void capCanCuocCongDan(ICapCanCuocCongDan iCapCanCuocCongDan) {
        if (iCapCanCuocCongDan.getCMND() == null) {
            System.out.println("Cong dan can co CMND");
            return;
        }
        if (iCapCanCuocCongDan.getSoHK() == null) {
            System.out.println("Cong dan can co So Ho Khau");
            return;
        }

        System.out.println("Xac minh giay to");
        System.out.println("Cap CCCD hoan thanh");
    }
//    public void capCanCuocCongDan(CongDanUS congDan) {
//        if (congDan.getCMND() == null) {
//            System.out.println("Cong dan can co CMND");
//            return;
//        }
//        if (congDan.getSoHK() == null) {
//            System.out.println("Cong dan can co So Ho Khau");
//            return;
//        }
//
//        System.out.println("Xac minh giay to");
//        System.out.println("Cap CCCD hoan thanh");
//    }

}
