package exercicios.lista5alunos.test;

import exercicios.lista5alunos.domain.Aluno;
import exercicios.lista5alunos.domain.Professora;
import exercicios.lista5alunos.domain.Turma;

public class TurmaTest01 {
    public static void main(String[] args) {
        Turma turma = new Turma("Estrutura de Dados");

        turma.adicionarMembro(new Aluno("Joao", "2000456"));
        turma.adicionarMembro(new Aluno("Jose", "2000458"));
        turma.adicionarMembro(new Aluno("Cleiton", "2000459"));
        turma.adicionarMembro(new Aluno("Sandro", "2000458"));
        turma.adicionarMembro(new Aluno("Rodrigo", "2000459"));

        turma.listarTodos();

        System.out.println("====Removendo o aluno da 5 posicao====");
        turma.removerPorIndice(4);

        turma.adicionarMembro(new Professora("Karina", "Estrutura de Dados"));

        turma.listarTodos();

        String nomeBuscado = "Joao";

        boolean encontrado = turma.verificarNome(nomeBuscado);
        System.out.println("\n\"" + nomeBuscado + "\" está na lista? "
                + (encontrado ? "Sim ✓" : "Não ✗"));
    }
}
