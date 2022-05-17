package codegym.interfacee.goc.moi;

import codegym.exceptions.CMNDException;
import codegym.exceptions.SoHKException;

class CongAn {
    void capCanCuocCongDan(ICapCanCuocCongDan capCanCuocCD) throws SoHKException, CMNDException {
        if (capCanCuocCD.getSoHK() == null) {
            SoHKException soHKException = new SoHKException("Cần có sổ hổ khẩu");
            throw soHKException;
        }
        if (capCanCuocCD.getCMND() == null) {
            throw new CMNDException("Cần có chứng minh nhân dân");
        }
        System.out.println("Xác minh giấy tờ liên quan");
        System.out.println("Cấp căn cước công dân hoàn thành");
        CCCD cccd = new CCCD();
        capCanCuocCD.capCanCongDanHoanThanh(cccd);
    }


}
