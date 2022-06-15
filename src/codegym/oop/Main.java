package codegym.oop;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[9];
       // Animal myAnimal = new Animal();
        Animal myAnimal = new Animal("Hello kiti",-100);
        myAnimal.setName("Hello kiti");
        System.out.println(myAnimal.getAge());
        // System.out.println(myAnimal.age);
    }
}
