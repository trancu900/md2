package codegym.interfacee.goc.moi;

class CongAn {
    void capCanCuocCongDan(ICapCanCuocCongDan capCanCuocCD) {
        if (capCanCuocCD.getSoHK() == null) {
            System.out.println("Cần có sổ hổ khẩu");
            return;
        }
        if (capCanCuocCD.getCMND() == null) {
            System.out.println("Cần có chứng minh nhân dân");
            return;
        }
        System.out.println("Xác minh giấy tờ liên quan");
        System.out.println("Cấp căn cước công dân hoàn thành");
        CCCD cccd=new CCCD();
        capCanCuocCD.capCanCongDanHoanThanh(cccd);
    }


}
