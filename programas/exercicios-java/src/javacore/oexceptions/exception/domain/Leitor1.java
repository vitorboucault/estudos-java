package javacore.oexceptions.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Closing Leitor1");
    }
}
