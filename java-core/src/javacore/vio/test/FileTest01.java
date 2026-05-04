package javacore.vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.exe");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            System.out.println(new Date(file.lastModified()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
