package codegym.designpattern.adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        JapaneseAdaptee nguoiNhat = new JapaneseAdaptee();
        EnglishAdaptee nguoiAnh = new EnglishAdaptee();
        VietnameseTarget client = new ETranslatorAdapter(nguoiAnh);
        client.send("Xin chào");
        client = new JPTranslatorAdapter(nguoiNhat);
        client.send("Xin chào");
    }
}
