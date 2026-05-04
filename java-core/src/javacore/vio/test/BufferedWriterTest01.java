package javacore.vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Hello World");
            bw.newLine();
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
