package codegym.file;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        buffer();
    }

    public static void buffer(){
        File srcFile = new File("source.txt");
        File dest = new File("source.txt");
        try {
            PrintWriter pw = new PrintWriter(srcFile);
            pw.write("Buoi khong di hoc\nsadfasdjfh\n");
            pw.close();
            BufferedReader br
                    = new BufferedReader(new FileReader(dest));
            StringBuilder builder =new StringBuilder();
            String line;
            while ((line = br.readLine()) != null){
                builder.append("\n");
                builder.append(line);
            }
            br.close();
            System.out.println(builder.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
