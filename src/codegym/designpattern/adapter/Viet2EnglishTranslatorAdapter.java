package codegym.designpattern.adapter;

public class Viet2EnglishTranslatorAdapter implements VietnameseTarget {
    private EnglishAdaptee adaptee;

    public Viet2EnglishTranslatorAdapter(EnglishAdaptee adaptee) {
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
        return "Hello";
    }
}
