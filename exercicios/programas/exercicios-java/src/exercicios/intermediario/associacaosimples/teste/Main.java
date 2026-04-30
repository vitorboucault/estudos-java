package exercicios.intermediario.associacaosimples.teste;

import exercicios.intermediario.associacaosimples.model.Aluno;
import exercicios.intermediario.associacaosimples.model.Seminario;

public class Main {
    public static void main(String[] args) {
        Seminario seminario = new Seminario("POO");
        Seminario seminario2 = new Seminario("Java");

        Aluno aluno = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Maria");

        aluno.vincularSeminario(seminario);
        aluno2.vincularSeminario(seminario2);


        seminario.imprimirParticipantes();
        seminario2.imprimirParticipantes();

        aluno.imprimirSeminario();
        aluno2.imprimirSeminario();

        seminario.removerAluno(aluno);

        seminario.imprimirParticipantes();

    }
}
