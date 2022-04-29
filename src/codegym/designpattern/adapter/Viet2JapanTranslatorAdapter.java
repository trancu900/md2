package codegym.designpattern.adapter;

public class Viet2JapanTranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public Viet2JapanTranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println(vietnameseWords + " Translated!");
        return "こんにちは";
    }
}
