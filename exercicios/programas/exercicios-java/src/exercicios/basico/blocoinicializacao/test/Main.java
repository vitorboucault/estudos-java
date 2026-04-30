package exercicios.basico.blocoinicializacao.test;

import exercicios.basico.blocoinicializacao.model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao",233121);
        Aluno aluno2 = new Aluno("Jose",233121);
        Aluno aluno3 = new Aluno("Jose",233121);
        System.out.println(aluno);
        System.out.println(Aluno.getTotalAlunos());

    }
}
