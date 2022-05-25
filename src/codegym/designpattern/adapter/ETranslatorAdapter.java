package codegym.designpattern.adapter;

public class ETranslatorAdapter implements VietnameseTarget {

    private EnglishAdaptee adaptee;

    public ETranslatorAdapter(EnglishAdaptee adaptee) {
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
        return "Hello";
    }
}
