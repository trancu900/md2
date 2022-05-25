package codegym.designpattern.adapter;

public class JPTranslatorAdapter implements VietnameseTarget {

    private JapaneseAdaptee adaptee;

    public JPTranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String japanWords = translate(words);
        adaptee.receive(japanWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
