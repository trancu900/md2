package codegym.interfacee.bo.sung;

public class Main {
    public static void main(String[] args) {
        CongAn congAn=new CongAn();
        CongDanVietNam congDan=new CongDanVietNam();
        try {
            congAn.capCanCuocCD(congDan);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally {
            System.out.println("Finally");
        }
        //ArrayList
    }

}
