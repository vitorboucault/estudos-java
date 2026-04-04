package javacore.gassociacao.exercise.test;

import javacore.gassociacao.exercise.domain.Aluno;
import javacore.gassociacao.exercise.domain.Local;
import javacore.gassociacao.exercise.domain.Professor;
import javacore.gassociacao.exercise.domain.Seminario;

public class AssociaoExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Hortencias");
        Aluno aluno = new Aluno("Jose", 18);
        Professor professor = new Professor("Maria", "Historia");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Java", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
