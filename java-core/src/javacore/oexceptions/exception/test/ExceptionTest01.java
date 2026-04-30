package javacore.oexceptions.exception.test;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("/Users/vbcripto/repositorios/estudos-java/arquivo.txt");
        try{
            boolean isCreado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreado);
        }catch(IOException e){
            e.printStackTrace();
            throw e;
            // Catch é para lidar com exceçÕes, e não para ter lógica de negocio
        }
    }
}
