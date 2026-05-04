package javacore.vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File arquivoDiretorio = new File(
                "/Users/vbcripto/repositorios/estudos-java/pasta/arquivo.txt");

        boolean isFileCreated = arquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File (fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File ("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
