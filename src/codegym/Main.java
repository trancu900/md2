package codegym;

import codegym.inheritance.animal.Animal;
import codegym.inheritance.animal.Dog;
import codegym.inheritance.geometric.Circle;

import java.io.*;
import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        try (FileInputStream fis
//                     = new FileInputStream("source.txt")) {
//            byte[] buffer = new byte[8];
//            fis.skip(4);
//            fis.read(buffer);
//            System.out.println(new String(buffer));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(System.currentTimeMillis() - time);
//    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        try (FileOutputStream fos
//                     = new FileOutputStream("source.txt")) {
//            byte[] buffer = {67, 111, 100, 101, 103, 121, 109};
//            fos.write(buffer);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        ArrayList li=new ArrayList();
        li.add(new Circle(10));
        li.add(new Circle(3));

        ObjectOutputStream oos=
                new ObjectOutputStream(
                        new FileOutputStream("tes")
                );
        oos.writeObject(li);
        ObjectInputStream ois=
                new ObjectInputStream(
                        new FileInputStream("tes"));

        Object obj = ois.readObject();

        System.out.println(obj);

    }


}