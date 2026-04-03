package javacore.gassociacao.test;

import javacore.gassociacao.dominio.Escola;
import javacore.gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Mizuno Sensei");

        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();




    }
}
