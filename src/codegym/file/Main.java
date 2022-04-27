package codegym.file;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("source.txt");
        File dest = new File("destination.txt");
        //dest.createNewFile();
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(dest, true);
        fis.skip(10);
        byte[] buffer = new byte[5];
        int length = fis.read(buffer);
        fos.write(buffer, 0, length);

    }
}
