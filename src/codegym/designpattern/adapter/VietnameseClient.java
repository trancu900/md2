package codegym.designpattern.adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new
                Viet2EnglishTranslatorAdapter(
                new EnglishAdaptee()
        );
        client.send("Xin chào");
    }
}
