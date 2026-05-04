public class No {
    Alunos aluno;
    No anterior;
    No proximo;

    public No(Alunos aluno) {
        this.aluno = aluno;
        this.anterior = null;
        this.proximo = null;
    }
}