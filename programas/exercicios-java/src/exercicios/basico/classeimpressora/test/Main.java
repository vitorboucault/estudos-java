package exercicios.basico.classeimpressora.test;

import exercicios.basico.classeimpressora.model.Impressora;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        impressora.imprimir("conteudo");
        impressora.imprimir(2);
        impressora.imprimir(2.4);
    }
}
