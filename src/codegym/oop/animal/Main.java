package codegym.oop.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Quynh");
        Animal cat = new Cat("Dai");

        Object object=new Dog("");
      //  object.toString();

     //   catCo(dog);
        catCo(cat);
    }

    public static void catCo(Animal animal) {
        animal.makeNoise();
    }

}
